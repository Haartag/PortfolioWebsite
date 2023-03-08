package composables.Dialog

import AppStyle
import androidx.compose.runtime.Composable
import data.Links
import dev.petuska.kmdc.typography.MDCBody1
import dev.petuska.kmdc.typography.MDCH4
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section

/**
 * PopUpScreen content for wide screen
 */

@Composable
fun LongDialog(
    mainScreenshot: String,
    icon: String,
    name: String,
    shortText: String,
    longText: String,
    screenshots: List<String>,
    links: Links,
    techs: List<String>,
    onClick: (Int) -> Unit
) {
    Section(attrs = {
        classes(AppStyle.DialogHideOnSmall)
    }) {
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                    justifyContent(JustifyContent.SpaceBetween)
                }
            }
        ) {
            // First column - big image
            MainImage(mainScreenshot)


            // Second column - main content
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        width(55.percent)
                    }
                }
            ) {

                // Row 1 - icon and name
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

                // Row 2 - texts
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
                    LinkButtons(links)
                }

                // Row 4 - screenshot selector
                Div(
                    attrs = {
                        style {
                            justifyContent(JustifyContent.SpaceBetween)
                        }
                        classes(AppStyle.DialogHideOnSmall)
                    }
                ) {
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.Flex)
                                flexDirection(FlexDirection.Row)
                            }
                        }
                    ) {
                        SmallImages(screenshots.drop(1)) {
                            onClick(it + 1)
                        }
                    }
                }
            }
            Techs(techs)
        }
    }
}
