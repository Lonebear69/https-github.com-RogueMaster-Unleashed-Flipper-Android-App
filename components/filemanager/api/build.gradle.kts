plugins {
    id("flipper.android-compose")
}

dependencies {
    implementation(projects.components.core.ui.navigation)
    implementation(projects.components.deeplink.api)

    implementation(libs.compose.ui)
}
