package composables.Dialog

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Section


@Composable
fun ShortDialog(
    mainScreenshot: String,
) {
    Section(attrs = {
        classes(AppStyle.DialogShowOnSmall)
    }) {
        MainImage(mainScreenshot)
    }
}
