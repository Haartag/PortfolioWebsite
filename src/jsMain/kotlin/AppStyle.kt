import org.jetbrains.compose.web.css.*

/**
 * CSS styles for app
 */
object AppStyle : StyleSheet() {

    init {
        universal style {
            margin(0.px)
        }
    }

    val DialogHideOnSmall by style {
        media(mediaMaxWidth(1200.px)) {
            self style {
                display(DisplayStyle.None)
            }
        }
    }
    val DialogShowOnSmall by style {
        media(mediaMinWidth(1200.px)) {
            self style {
                display(DisplayStyle.None)
            }
        }
    }

    val HeaderDarkGray by style {
        width(100.percent)
        height(80.px)
        backgroundColor(Color("#323236"))
    }

    val Logo by style {
        width(100.percent)
    }

    val MainIntro by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        width(100.percent)
        height(320.px)
        backgroundColor(Color("#99988E"))
        media(mediaMaxWidth(900.px)) {
            self style {
                height(480.px)
            }
        }
    }

    val Photo by style {
        marginLeft(10.percent)
        maxHeight(80.percent)
        paddingTop(32.px)
        media(mediaMaxWidth(900.px)) {
            self style {
                marginLeft(7.5.percent)
                maxHeight(50.percent)
                paddingTop(32.px)
            }
        }
    }

    val TextBoxPadding by style {
        padding(5.percent)
    }

    val TextBoxMargin by style {
        paddingTop(24.px)
    }

    val CardTitle by style {
        paddingTop(24.px)
        paddingLeft(24.px)
    }

    val CardText by style {
        paddingLeft(24.px)
    }

    val Icon by style {
        marginLeft(5.percent)
        marginTop(5.percent)
        height(104.px)
        width(104.px)
    }

    val Screenshot by style {
        height(100.percent)
        padding(24.px)
    }

    val DialogScreenshot by style {
        boxSizing("border-box")
        property("width", "auto")
        padding(12.px)
    }

    val DialogScreenshotSmall by style {
        height(160.px)
        padding(8.px)
    }

    val LinkIcon by style {
        width(140.px)
    }

}