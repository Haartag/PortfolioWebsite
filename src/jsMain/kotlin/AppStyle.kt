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
        backgroundColor(Color("#99988E"))
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

}