plugins {
    kotlin("jvm") version "1.4.32"
    kotlin("kapt") version "1.4.32"
}

group = "com.caseykulm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
