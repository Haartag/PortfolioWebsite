package composables.Dialog

import androidx.compose.runtime.*
import data.PortfolioData
import dev.petuska.kmdc.dialog.MDCDialog
import dev.petuska.kmdc.dialog.onClosed

/**
 * Pop-up screen with card details
 */
@Composable
fun PopUpScreen(
    portfolioData: PortfolioData,
    isDialogOpen: () -> Boolean,
    closeDialog: (Boolean) -> Unit
) {
    MDCDialog(
        open = isDialogOpen(),
        fullscreen = true,
        attrs = {
            onClosed { closeDialog(false) }
        }
    ) {
        var currentScreenshot by remember {
            mutableStateOf(portfolioData.screenshot[0])
        }
        val smallScreenshots = remember { portfolioData.screenshot.toMutableStateList() }
        LongDialog(
            mainScreenshot = currentScreenshot,
            icon = portfolioData.img,
            name = portfolioData.itemName,
            shortText = portfolioData.shortDescription,
            longText = portfolioData.longDescription,
            links = portfolioData.links,
            screenshots = smallScreenshots,
            techs = portfolioData.techDescription,
            onClick = {
                currentScreenshot = smallScreenshots[it]
                val skip = smallScreenshots.take(it)
                smallScreenshots.removeRange(0, it)
                smallScreenshots.addAll(skip)
            }
        )
        ShortDialog(currentScreenshot)
    }
}