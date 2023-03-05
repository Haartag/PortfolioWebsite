import androidx.compose.runtime.remember
import composables.Header
import composables.Intro
import composables.PortfolioLayout
import composables.PortfolioTile
import data.PortfolioData
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {

    renderComposable(rootElementId = "root") {
        Style(AppStyle)

        Header()
        Intro()

        val portfolioList = remember { PortfolioData.values().sortedBy { it.id } }

        for (index in portfolioList.indices) {
            PortfolioLayout(
                color1 = if (index < 1) {
                    "#99988E"
                } else {
                    portfolioList[index - 1].color
                },
                color2 = portfolioList[index].color,

                ) {
                PortfolioTile(
                    portfolioList[index],
                )
            }
        }
    }
}

