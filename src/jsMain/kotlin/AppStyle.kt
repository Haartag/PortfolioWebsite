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
}