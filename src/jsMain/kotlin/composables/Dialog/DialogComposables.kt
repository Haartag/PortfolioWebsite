package composables.Dialog

import AppStyle
import androidx.compose.runtime.Composable
import data.Links
import dev.petuska.kmdc.list.MDCList
import dev.petuska.kmdc.list.MDCListType
import dev.petuska.kmdc.typography.MDCBody1
import dev.petuska.kmdc.typography.MDCH4
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section

/**
 * Big screenshot
 */
@Composable
fun MainImage(
    img: String,
    height: CSSNumeric
) {
    Img(img, attrs = {
        style {
            height(height)
        }
        classes(AppStyle.DialogScreenshot)
    })
}

@Composable
fun Title(
    icon: String,
    name: String
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
            }
        }
    ) {
        Img(icon, attrs = {
            classes(AppStyle.Icon)
        })
        MDCH4(name, attrs = {
            style { padding(36.px) }
        })
    }
}

@Composable
fun Texts(
    shortText: String,
    longText: String
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                paddingTop(24.px)
                justifyContent(JustifyContent.SpaceBetween)
            }
        }
    ) {
        MDCBody1(shortText, attrs = {
            style {
                fontStyle("Italic")
            }
        })
        MDCBody1(longText, attrs = {
            style {
                paddingTop(24.px)
            }
        })
    }
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
        techs.forEachIndexed {index, item ->
            MDCBody1(item, attrs = {
                style {
                    border(
                        width = 1.px,
                        style = LineStyle.Double,
                        color = Color("#000000")
                    )
                    padding(8.px)
                    if (index != 0) marginTop(-1.px)
                }
            })
        }
    }
}

@Composable
fun SmallTechs(
    techs: List<String>
) {
    Section(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
        }
    ) {
        val rows = if (techs.size % 3 == 0) techs.size / 3 else techs.size / 3 + 1

        MDCList(
            type = MDCListType.Textual,
            attrs = {
                style {
                    flexDirection(FlexDirection.Column)
                }
            }
        ) {
            repeat(rows) {row ->
                val columns = if (techs.size - row * 3 >= 3) 3 else techs.size - row * 3
                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Row)
                            if (row != 0) marginTop(-1.px)
                        }
                    }
                ) {
                    repeat(columns) {column ->
                        MDCBody1(techs[row * 3 + column], attrs = {
                            style {
                                border(
                                    width = 1.px,
                                    style = LineStyle.Solid,
                                    color = Color("#000000")
                                )
                                padding(8.px)
                                width(20.percent)
                                if (column != 0) marginLeft(-1.px)
                            }
                        })
                    }
                }
            }
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