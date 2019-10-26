@file:Suppress("ClassName", "SpellCheckingInspection")

import org.gradle.api.JavaVersion

object deps {
    object versions {
        const val androidGradle = "3.5.1"
        const val kotlin = "1.3.50"
        val java = JavaVersion.VERSION_1_8
    }

    object build {
        const val minSdk = 21
        const val targetSdk = 29
        const val compileSdk = 29
    }

    object plugin {
        const val gradle = "com.android.tools.build:gradle:${deps.versions.androidGradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${deps.versions.kotlin}"
        const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.1.0"
    }

    object kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${versions.kotlin}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0"
    }

    object android {
        const val core = "androidx.core:core-ktx:1.1.0"
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-alpha05"
        const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:2.2.0-alpha05"

        object test {
            const val core = "androidx.test:core:1.2.0"
            const val junit = "androidx.test.ext:junit:1.1.1"
            const val runner = "androidx.test:runner:1.2.0"
        }

        object navigation {
            private const val navVersion = "2.1.0"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
            const val ui = "androidx.navigation:navigation-ui-ktx:$navVersion"
        }

        object ui {
            const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
            const val material = "com.google.android.material:material:1.0.0"
        }
    }

    object test {
        const val robolectric = "org.robolectric:robolectric:4.3"
    }
}
