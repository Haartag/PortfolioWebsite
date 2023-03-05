package composables

import AppStyle
import androidx.compose.runtime.*
import data.PortfolioData
import dev.petuska.kmdc.card.MDCCard
import dev.petuska.kmdc.card.MDCCardType
import dev.petuska.kmdc.typography.MDCBody1
import dev.petuska.kmdc.typography.MDCH5
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*


/**
 * Layout for one portfolio card, background with gradient.
 */
@Composable
fun PortfolioLayout(
    color1: String,
    color2: String,
    content: @Composable () -> Unit)
{
    Div({
        style {
            width(100.percent)
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(AlignItems.Center)
            boxSizing("border-box")
            backgroundImage("linear-gradient(180deg, $color1 0%, $color2 100%)")
        }
    }) {
        content()
    }
}

/**
 * Portfolio card
 */
@Composable
fun PortfolioTile(
    portfolioData: PortfolioData,
) {
    var clicked by remember { mutableStateOf(false) }

    MDCCard(
        type = MDCCardType.Elevated,
        attrs = {
            style {
                width(50.percent)
                height(420.px)
                marginTop(10.percent)
                marginBottom(10.percent)
                backgroundColor(Color("#AAAAAA"))
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
            onClick {
                clicked = !clicked
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    width(100.percent)
                    height(100.percent)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                    }
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
                    Img(src = portfolioData.img, attrs = {
                        classes(AppStyle.Icon)
                    })
                    MDCH5(portfolioData.itemName, attrs = { classes(AppStyle.CardTitle) })
                }
                MDCBody1(portfolioData.shortDescription, attrs = {
                    classes(AppStyle.CardTitle)
                    style { fontStyle("Italic") }
                })
                Div(
                    attrs = {
                        style { height(20.percent) }
                    }
                )
                MDCBody1(
                    "Main technologies:",
                    attrs = {
                        classes(AppStyle.CardTitle)
                        style { fontStyle("Bold") }
                    })
                MDCBody1(
                    portfolioData.techDescription.joinToString(separator = ", ", postfix = "."),
                    attrs = {
                        classes(AppStyle.CardText)
                    })

            }
            Img(src = portfolioData.screenshot[0], attrs = {
                classes(AppStyle.Screenshot)
            })
        }
    }
}