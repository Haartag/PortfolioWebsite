import composables.Header
import composables.Intro
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {

    renderComposable(rootElementId = "root") {
        Style(AppStyle)

        Header()
        Intro()
    }
}

