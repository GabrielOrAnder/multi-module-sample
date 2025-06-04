plugins {
    alias(libs.plugins.application)
    alias(libs.plugins.kotlin)
//    alias(libs.plugins.safe.args)
}

android {
    namespace = "br.com.gabrielorander.multi_module_sample"
    compileSdk = 33

    defaultConfig {
        applicationId = "br.com.gabrielorander.multi_module_sample"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(project(":home:feature"))
    implementation(project(":search:feature"))
    implementation(project(":bookmark:feature"))
    
    implementation(libs.bundles.ui)
    implementation(libs.bundles.navigation)

    testImplementation(libs.bundles.testing)
}