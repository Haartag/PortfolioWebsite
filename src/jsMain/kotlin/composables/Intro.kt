package composables

import AppStyle
import androidx.compose.runtime.Composable
import data.IntroDataObject
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
            H1 {
                Text(IntroDataObject.introData.subTitle)
            }
            H1(
                attrs = {
                    classes(AppStyle.TextBoxMargin)
                }
            ) {
                Text(IntroDataObject.introData.title)
            }
            H4(
                attrs = {
                    classes(AppStyle.TextBoxMargin)
                }
            ) {
                Text (IntroDataObject.introData.text)
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