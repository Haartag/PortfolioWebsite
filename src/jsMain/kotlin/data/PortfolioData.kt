package data


data class Links(
    val git: String,
    val googlePlay: String? = null
)
enum class PortfolioData(
    val id: Int,
    val itemName: String,
    val img: String,
    val screenshot: List<String>,
    val color: String,
    val shortDescription: String,
    val longDescription: String,
    val techDescription: List<String>,
    val links: Links,
) {
    ISS (
        id = 30,
        itemName = "ISS locator",
        img = "icIss.png",
        screenshot = listOf("scISS1.png", "scISS2.png", "scISS3.png"),
        color = "#bd7270",
        shortDescription = "You can always know where the International Space Station is now.",
        longDescription = "The app shows in real time the point on the world map over which the ISS is located." +
                " \"Well, the space station orbits Earth about every 90 minutes, so that means in a 24 hour day, " +
                "the space station orbits approximately 16 times.\"",
        techDescription = listOf("Jetpack Compose", "Clean architecture", "Hilt", "Google maps API", "Retrofit2"),
        links = Links(
            git = "https://github.com/Haartag/GoogleMapsIssLocation"
        ),

    ),
    FOOD (
        id = 20,
        itemName = "3akroma",
        img = "icFood.png",
        screenshot = listOf("scFood1.png", "scFood2.png", "scFood3.png", "scFood4.png"),
        color = "#e88c5d",
        shortDescription = "Simple app to manage storage of something.",
        longDescription = "3akroma is a simple and easy to learn and manage app to track and store anything - groceries, " +
                "supplies, tools, and anything else you can think of!",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Kotlin Coroutines", "Room", "Hilt",
            "Coil", "JUnit"),
        links = Links(
            git = "https://github.com/Haartag/ComposedStorage",
            googlePlay = "https://play.google.com/store/apps/details?id=com.valerytimofeev.composedstorage"
        ),

    ),
    HH (
        id = 10,
        itemName = "Heroes Helper",
        img = "icH3Pand.png",
        screenshot = listOf("scH3Pand1.png", "scH3Pand2.png", "scH3Pand3.png", "scH3Pand4.png"),
        color = "#E0BF59",
        shortDescription = "Advanced pandora's box calculator for Heroes III HotA.",
        longDescription = "Heroes Helper is a simple and easy-to-use app for Heroes III HotA that allows you to " +
                "determine the correct contents of Pandora's Box. You will be able to find out the percentage chance " +
                "of rewards, the possible range of the number of guards and the most probable guards of the box.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Kotlin Coroutines", "Room", "Hilt", "JUnit"),
        links = Links(
            git = "https://github.com/Haartag/H3Pand",
            googlePlay = "https://play.google.com/store/apps/details?id=com.valerytimofeev.h3pand"
        )

    ),
    WEB (
        id = 99,
        itemName = "...and this website!",
        img = "icWeb.png",
        screenshot = listOf("scWeb1.png", "scWeb2.png"),
        color = "#748392",
        shortDescription = "Simple portfolio website on Kotlin Compose Web",
        longDescription = "",
        techDescription = listOf("Kotlin Multiplatform", "Compose Web", "KMDC"),
        links = Links(
            git = "https://github.com/Haartag/PortfolioWebsite"
        )

    ),
    TEST (
        id = 77,
        itemName = "Various test tasks",
        img = "icTest.png",
        screenshot = listOf("scTest1.png", "scTest2.png", "scTest3.png"),
        color = "#104090",
        shortDescription = "",
        longDescription = "",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Coil", "Retrofit", "OkHttp", "Google Maps API", "Palette", "JUnit", "Mockk"),
        links = Links(
            git = "https://github.com/Haartag/LiveHackTestTask"
        )
    )
}