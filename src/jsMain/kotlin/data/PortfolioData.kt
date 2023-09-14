package data


data class Links(
    val git: String? = null,
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
        shortDescription = "Simple app to manage storage of something. Or maybe even everything.",
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
        id = 15,
        itemName = "Heroes Helper",
        img = "icH3Pand.png",
        screenshot = listOf("scH3Pand1.png", "scH3Pand2.png", "scH3Pand3.png", "scH3Pand4.png"),
        color = "#E0BF59",
        shortDescription = "An app for a 20-year-old retro-game. Advanced pandora's box calculator for Heroes III HotA.",
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
        shortDescription = "Simple portfolio website on Kotlin + Compose Web",
        longDescription = "A website made entirely in Kotlin, using the Compose Web. A little ugly, but hey, " +
                "all in Kotlin!",
        techDescription = listOf("Kotlin Multiplatform", "Compose Web", "KMDC"),
        links = Links(
            git = "https://github.com/Haartag/PortfolioWebsite"
        )

    ),
/*    TEST (
        id = 77,
        itemName = "Various test tasks",
        img = "icTest.png",
        screenshot = listOf("scTest1.png", "scTest2.png", "scTest3.png"),
        color = "#104090",
        shortDescription = "",
        longDescription = "The most interesting test tasks.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Coil", "Retrofit", "OkHttp", "Google Maps API", "Palette", "JUnit", "Mockk"),
        links = Links(
            git = "https://github.com/Haartag/LiveHackTestTask"
        )
    ),*/
    HTTP (
        id = 18,
        itemName = "HTTP Requester",
        img = "icHttp.png",
        screenshot = listOf("scHttp1.png", "scHttp2.png", "scHttp3.png", "scHttp4.png",),
        color = "#B96EC2",
        shortDescription = "HTTP requester with proxy, multithreading and other cool features ",
        longDescription = "Application for sending HTTP requests (GET or POST) with a set of very useful features: the " +
                "use of proxies, random headers, multi-threading to perform a large number of simultaneous requests, " +
                "saving requests to favorites, logs (including saving them into External storage for access), " +
                "the ability to set a chain of requests and execute them within one session and much more.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Retrofit2", "OkHttp3", "Kotlinx serialization", "Shared preferences"),
        links = Links()
    ),
    EBAY (
        id = 5,
        itemName = "eBay orders ",
        img = "icEbay.png",
        screenshot = listOf("scEbay1.png", "scEbay2.png", "scEbay3.png",),
        color = "#BBE5A9",
        shortDescription = "App for managing eBay orders and tracking parcels ",
        longDescription = "Introducing the eBay Order Management App. This application interfaces with eBay's API to " +
                "download order information for a selected timeframe and organizes the data into a user-specified " +
                "Google Sheets table. Leveraging the power of MLKit, the app is capable of identifying parcel " +
                "tracking codes through the camera. Once recognized, these codes can be marked as 'Delivered' " +
                "in the Google Sheets table or new codes can be added as required.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Retrofit2", "OkHttp3", "CameraX", "mlKit", "eBay API", "Google Sheets API"),
        links = Links()
    ),
    PROP (
        id = 7,
        itemName = "Property Management Solution",
        img = "icProp.png",
        screenshot = listOf("scProp1.png", "scProp2.png", "scProp3.png", "scProp4.png",),
        color = "#CB99C9",
        shortDescription = "Property Management Solution - Tracking & Automation",
        longDescription = "The app offers property owners access to their accrued payments, providing them with complete " +
                "control over their finances. For administrators, app provides robust tools to manage customer payments, " +
                "including the ability to send personalized or broadcast push notifications. The application further " +
                "simplifies tasks with its automatic calculation feature, ensuring accurate tracking of payment " +
                "schedules and debts.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Firebase", "Push notifications", "Retrofit2", "OkHttp3", "Coil", "Shared preferences"),
        links = Links()
    ),
    LANG (
        id = 3,
        itemName = "Pronunciation Learning",
        img = "icLang.png",
        screenshot = listOf("scLang1.png", "scLang2.png", "scLang3.png", "scLang4.png",),
        color = "#A2D5F2",
        shortDescription = "App for interactive language practice with speech synthesis.",
        longDescription = "An Android app designed in Kotlin for practical language learning. Utilizing Google Cloud " +
                "Text-to-Speech, it allows users to generate speech from text, create sequences with customizable " +
                "voices, and curate word sets. The built-in player offers easy playback, while progress tracking keeps " +
                "learners on course.",
        techDescription = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "Hilt", "Kotlin Coroutines",
            "Text-to-Speech","Google Cloud Services", "Retrofit2", "OkHttp3", "Room Database"),
        links = Links()
    ),
}