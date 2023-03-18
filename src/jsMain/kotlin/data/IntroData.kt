package data

/**
 *
 */
object IntroDataObject {
    val introData = IntroData(
        img = "photo.png",
        title = "Mobile Developer",
        subTitle = "Valeriy Timofeev",
        text = listOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut" +
            " labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris ",
            "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
            "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt ",
            "in culpa qui officia deserunt mollit anim id est laborum."
        ),
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
    val text: List<String>,
    val cvEnLink: String,
    val cvRuLink: String,
    val linkedIn: String,
    val email: String,
    val tg: String
)