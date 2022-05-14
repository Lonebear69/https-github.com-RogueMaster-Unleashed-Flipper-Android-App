plugins {
    androidCompose
    id("com.squareup.anvil")
    id("kotlin-kapt")
}

dependencies {
    implementation(projects.components.inappnotification.api)
    implementation(projects.components.core.di)
    implementation(projects.components.core.ui)
    implementation(projects.components.core.log)
    implementation(projects.components.core.ktx)

    implementation(libs.cicerone)
    implementation(libs.appcompat)
    implementation(libs.kotlin.coroutines)

    // Compose
    implementation(libs.compose.ui)
    implementation(libs.compose.tooling)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.image.lottie)

    // Dagger deps
    implementation(libs.dagger)
    kapt(libs.dagger.kapt)
}