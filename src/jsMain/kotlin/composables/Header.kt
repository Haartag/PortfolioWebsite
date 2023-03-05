package composables

import AppStyle
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section


/**
 * Header line with logo
 */
@Composable
fun Header() {
    Section(attrs = {
        classes(AppStyle.HeaderDarkGray)
    }) {
        Div(
            { classes(AppStyle.Logo) }
        ) {
            Logo()
        }
    }
}

@Composable
private fun Logo() {
    Div(attrs = {
        //classes(WtCols.wtColInline)
    }) {
        Img(src = "logo.jpg", attrs = {
            style {
                height(80.px)
                paddingLeft(80.px)
            }
        })
    }
}