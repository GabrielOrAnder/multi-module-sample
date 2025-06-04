pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
//    versionCatalogs {
//        create("libs") {
//            from(files("../gradle/libs.versions.toml"))
//        }
//    }
}
rootProject.name = "multi-module-sample"
include(":app")
include(":home")
include(":home:feature")
include(":home:sample")
include(":search")
include(":search:sample")
include(":search:feature")
include(":bookmark")
include(":bookmark:sample")
include(":bookmark:feature")
