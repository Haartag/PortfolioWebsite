import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group "com.example"
version "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://mvnrepository.com/artifact/dev.petuska/kmdc")
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport { enabled = true }
                scssSupport { enabled = true }
            }
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)


                implementation("dev.petuska:kmdc:0.1.0")
                implementation("dev.petuska:kmdcx:0.1.0")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}