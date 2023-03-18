package data

/**
 *
 */
object IntroDataObject {
    val introData = IntroData(
        img = "photo.png",
        title = "Mobile Developer",
        subTitle = "Valeriy Timofeev",
        text = "Some text about me.",
        cvEnLink = "",
        cvRuLink = "",
        linkedIn = "https://www.linkedin.com/in/valeriy-timofeev-03861b233/",
        email = "llin.first@gmail.com",
        tg = "@llinFirst"
    )
}

data class IntroData(
    val img: String,
    val title: String,
    val subTitle: String,
    val text: String,
    val cvEnLink: String,
    val cvRuLink: String,
    val linkedIn: String,
    val email: String,
    val tg: String
)