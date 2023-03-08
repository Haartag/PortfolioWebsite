package composables.Dialog

import AppStyle
import androidx.compose.runtime.Composable
import data.Links
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
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
            MainImage(mainScreenshot, 480.px)


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
                Title(icon, name)

                // Row 2 - texts
                Texts(shortText, longText)

                //Row 3 - links
                LinkButtons(links)

                // Row 4 - screenshot selector
                SmallImages(screenshots.drop(1)) {
                    onClick(it + 1)
                }
            }
            Techs(techs)
        }
    }
}
