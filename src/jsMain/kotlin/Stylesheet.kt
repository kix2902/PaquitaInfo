import org.jetbrains.compose.web.css.*

object AppStylesheet : StyleSheet() {
    init {
        universal style {
            backgroundColor(Color("#191b22"))
            borderRadius(4.px)
            fontFamily("sans-serif")
            color(Color.whitesmoke)
        }
    }

    val banner by style {
        width(100.percent)
    }
    val title by style {
        backgroundColor(Color.transparent)
        textAlign("center")
        fontSize(24.px)
        fontWeight(700)
        marginBottom(10.px)
    }
    val cardDataTitle by style {
        backgroundColor(Color.transparent)
        textAlign("top")
        fontSize(20.px)
    }
    val cardData by style {
        backgroundColor(Color.transparent)
        textAlign("center")
        fontSize(24.px)
        fontWeight(700)
        marginTop(10.px)
        marginBottom(20.px)
    }
}
