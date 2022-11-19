import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({ classes(AppStylesheet.main) }) {
        content()
    }
}

@Composable
fun CardContainer(content: @Composable () -> Unit) {
    Div({ classes(AppStylesheet.cardContainer) }) {
        content()
    }
}


@Composable
fun Card(content: @Composable () -> Unit) {
    Div({ classes(AppStylesheet.card) }) {
        content()
    }
}
