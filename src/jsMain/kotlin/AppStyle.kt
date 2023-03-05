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
        backgroundColor(Color("#f0a499"))
    }

    val Photo by style {
        marginLeft(10.percent)
        maxHeight(80.percent)
        paddingTop(32.px)
    }

    val TextBoxPadding by style {
        padding(5.percent)
    }

    val TextBoxMargin by style {
        paddingTop(24.px)
    }
}