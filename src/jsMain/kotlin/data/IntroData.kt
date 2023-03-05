package data

/**
 *
 */
object IntroDataObject {
    val introData = IntroData(
        img = "photo.png",
        title = "Mobile Developer",
        subTitle = "Valeriy Timofeev",
        text = "Some text about me."
    )
}

data class IntroData(
    val img: String,
    val title: String,
    val subTitle: String,
    val text: String
)