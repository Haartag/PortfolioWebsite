package composables

import AppStyle
import androidx.compose.runtime.Composable
import data.IntroDataObject
import dev.petuska.kmdc.typography.MDCBody1
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.dom.*

/**
 * Intro: photo, name, about
 */
@Composable
fun Intro() {
    Section(attrs = {
        classes(AppStyle.MainIntro)
    }) {

        Img(src = IntroDataObject.introData.img, attrs = { classes(AppStyle.Photo) })

        Div(
            attrs = {
                classes(AppStyle.TextBoxPadding)
            }
        ) {
            H1(
                attrs = {
                    style {
                        fontFamily("Monaco")
                    }
                }
            ) {
                Text(IntroDataObject.introData.title)
            }

            IntroDataObject.introData.text.forEach { paragraph ->
                MDCBody1(
                    text = paragraph,
                    attrs = {
                        classes(AppStyle.TextBoxMargin)
                    }
                )
            }
        }

        /**
         * Intro part with LinkedIn and CV links, now disabled
         */
        /*        Div(
                    attrs = {
                        classes(AppStyle.TextBoxPadding)
                    }
                ) {
                    A(
                        href = IntroDataObject.introData.linkedIn,
                        attrs = {
                            style {
                                outline("none")
                            }
                        }
                    ) {
                        Img("icLinked.png", attrs = {
                            classes(AppStyle.LinkIcon)
                        })
                    }
                }*/
    }
}