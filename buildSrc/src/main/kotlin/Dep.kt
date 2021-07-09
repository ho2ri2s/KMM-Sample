object Dep {
    object Versions {
        const val kotlin = "1.5.10"
        internal const val ktor = "1.6.1"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val android = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
    }
}