package data

/**
 *
 */
object IntroDataObject {
    val introData = IntroData(
        img = "photo.png",
        title = "Valeriy Timofeev, mobile developer.",
        text = listOf(
            "I am a developer of native mobile applications for Android smartphones. In Kotlin. ",
            "I enjoy using the latest approaches and technologies in my applications. Anything that makes development " +
                    "better and easier, like Clean architecture, MVVM, Jetpack Compose, Dagger/Hilt, etc. You can see " +
                    "some of my works below. ",
            "Feel free to click on the cards if you want to see details!"
        ),
        cvEnLink = "",
        cvRuLink = "",
        linkedIn = "https://www.linkedin.com/in/valeriy-timofeev-03861b233/",
        email = "llin.first@gmail.com",
        tg = "@llinFirst"
    )
}

data class IntroData(
    val img: String,
    val title: String,
    val text: List<String>,
    val cvEnLink: String,
    val cvRuLink: String,
    val linkedIn: String,
    val email: String,
    val tg: String
)