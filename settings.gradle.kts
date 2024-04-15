pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CaloryTracker"
include(":app")
include(":core")
include(":onboarding")
include(":onboarding:presentation")
include(":onboarding:onboarding_domain")
include(":tracker")
include(":tracker:tracker_domain")
include(":tracker:tracker_presentation")
include(":tracker:tracker_data")
