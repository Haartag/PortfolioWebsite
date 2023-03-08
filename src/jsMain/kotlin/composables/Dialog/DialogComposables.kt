package composables.Dialog

import AppStyle
import androidx.compose.runtime.Composable
import data.Links
import dev.petuska.kmdc.list.MDCList
import dev.petuska.kmdc.list.MDCListType
import dev.petuska.kmdc.typography.MDCBody1
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

/**
 * Big screenshot
 */
@Composable
fun MainImage(
    img: String,
) {
    Img(img, attrs = {
        classes(AppStyle.DialogScreenshot)
    })
}

@Composable
fun Techs(
    techs: List<String>
) {
    MDCList(
        type = MDCListType.Textual,
        attrs = {
            style {
                width(20.percent)
                flexDirection(FlexDirection.Column)
            }
        }
    ) {
        techs.forEach {
            MDCBody1(it, attrs = {
                style {
                    border(
                        width = 1.px,
                        style = LineStyle.Double,
                        color = Color("#000000")
                    )
                    padding(8.px)
                }
            })
        }
    }
}

/**
 * GitHub and GooglePlay buttons
 */
@Composable
fun LinkButtons(
    links: Links,
    column: Boolean = false
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                if (column) {
                    flexDirection(FlexDirection.Column)
                } else {
                    flexDirection(FlexDirection.Row)
                }

            }
        }
    ) {
        if (links.googlePlay != null) {
            A(
                href = links.googlePlay,
                attrs = {
                    style {
                        outline("none")
                    }
                }
            ) {
                Img("playIcon.png", attrs = {
                    classes(AppStyle.LinkIcon)
                })
            }
        }
        A(
            href = links.git,
            attrs = {
                style {
                    outline("none")
                }
            }
        ) {
            Img("gitHubIcon.png", attrs = {
                classes(AppStyle.LinkIcon)
            })
        }
    }
}

/**
 * Screenshot selector
 */
@Composable
fun SmallImages(
    imgs: List<String>,
    onClick: (Int) -> Unit
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
            }
        }
    ) {
        for (index in imgs.indices) {
            Img(imgs[index], attrs = {
                classes(AppStyle.DialogScreenshotSmall)
                onClick {
                    onClick(index)
                }
            })
        }
    }
}