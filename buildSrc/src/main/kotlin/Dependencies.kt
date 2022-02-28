/**
 * @author bobby
 * Created 13/02/22 at 14.55
 */
object Dependencies {
    val core by lazy { "androidx.core:core-ktx:${Versions.core}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }

    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }

    val gradlePlugin by lazy { "com.android.tools.build:gradle:${Versions.androidGradlePlugin}" }
    val kotlinPlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}" }

    val koin by lazy { "io.insert-koin:koin-android:${Versions.koin}" }
    val koinGraph by lazy { "io.insert-koin:koin-androidx-workmanager:${Versions.koin}" }
    val koinCompose by lazy { "io.insert-koin:koin-androidx-compose:${Versions.koin}" }

    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" }
    val livedata by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}" }
    val lifecycleCompiler by lazy { "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}" }

    val gson by lazy { "com.google.code.gson:gson:${Versions.gson}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val retrofitGsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit}" }

    val okhttpBom by lazy { "com.squareup.okhttp3:okhttp-bom:${Versions.okHttp}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp" }

    val chucker by lazy { "com.github.chuckerteam.chucker:library:${Versions.chucker}" }

}

object ComposeLibraries {
    val ui by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val material by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val toolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val activity by lazy { "androidx.activity:activity-compose:1.4.0" }
    val tooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}" }
    val foundation by lazy { "androidx.compose.foundation:foundation:${Versions.compose}" }
    val compiler by lazy { "androidx.compose.compiler:compiler:${Versions.compose}" }
    val navigation by lazy { "androidx.navigation:navigation-compose:${Versions.composeNavigation}" }
}