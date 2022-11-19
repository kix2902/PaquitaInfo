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

    val main by style {
        backgroundColor(Color("#282C37"))
        width(600.px)
        property("margin", "0 auto")
        padding(20.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                width(100.percent)
            }
        }
    }
    val cardContainer by style {
        backgroundColor(Color.transparent)
        marginTop(20.px)
        display(DisplayStyle.Grid)
        gridTemplateColumns("1fr 1fr")
        gap(60.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                gap(10.vw)
            }
        }
    }
    val card by style {
        backgroundColor(Color("#313543"))
        padding(20.px)
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
