package composables.Dialog

import AppStyle
import androidx.compose.runtime.Composable
import data.Links
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Section


@Composable
fun ShortDialog(
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
        classes(AppStyle.DialogShowOnSmall)
    }) {
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                }
            }
        ) {
            //Row 1 - main img, icon+name and texts
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Row)
                        justifyContent(JustifyContent.SpaceBetween)
                    }
                }
            ) {
                MainImage(mainScreenshot, 400.px)
                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                        }
                    }
                ) {
                    Title(icon, name)
                    Texts(shortText, longText)
                }
            }

            //Row 2 - screenshots, links
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
                LinkButtons(links, true)
            }

            SmallTechs(techs)
        }
    }
}
