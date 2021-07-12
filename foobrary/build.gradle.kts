plugins {
    kotlin("jvm")
    kotlin("kapt")
}

group = "com.caseykulm"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("com.google.dagger:dagger:2.37")
    kapt("com.google.dagger:dagger-compiler:2.37")
}
