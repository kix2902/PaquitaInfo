import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        style {
            padding(0.px)
            margin(0.px)
        }
    }) {
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            backgroundColor(Color("#282C37"))
            width(590.px)
            flex("1 0 auto")
            property("margin", "0 auto")
            padding(20.px)
            boxSizing("border-box")
        }
    }) {
        content()
    }
}

@Composable
fun CardContainer(content: @Composable () -> Unit) {
    Div({
        style {
            backgroundColor(Color.transparent)
            marginTop(20.px)
            display(DisplayStyle.Grid)
            gridTemplateColumns("1fr 1fr")
            gap(60.px)
        }
    }) {
        content()
    }
}


@Composable
fun Card(content: @Composable () -> Unit) {
    Div({
        style {
            backgroundColor(Color("#313543"))
            padding(20.px)
        }
    }) {
        content()
    }
}
