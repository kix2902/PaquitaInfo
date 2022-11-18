import androidx.compose.runtime.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        val coroutineScope = rememberCoroutineScope()
        var data by mutableStateOf<InstanceData?>(null)

        SideEffect {
            coroutineScope.launch {
                withContext(Dispatchers.Default) {
                    data = Api.getInstanceData()
                }
            }
        }

        Style(AppStylesheet)
        Layout {
            MainContentLayout {
                Img(src = "banner.png",
                    alt = "banner",
                    attrs = { classes(AppStylesheet.banner) }
                )
                H1(
                    attrs = { classes(AppStylesheet.title) }
                ) {
                    Text("paquita.masto.host")
                }
                CardContainer {
                    Card {
                        Div(
                            attrs = { classes(AppStylesheet.cardDataTitle) }
                        ) {
                            Text("Users:")
                        }
                        Div(
                            attrs = { classes(AppStylesheet.cardData) }
                        ) {
                            Text(data?.stats?.userCount?.toString() ?: "...")
                        }
                    }
                    Card {
                        Div(
                            attrs = { classes(AppStylesheet.cardDataTitle) }
                        ) {
                            Text("Toots:")
                        }
                        Div(
                            attrs = { classes(AppStylesheet.cardData) }
                        ) {
                            Text(data?.stats?.statusCount?.toString() ?: "...")
                        }
                    }
                }
            }
        }
    }
}
