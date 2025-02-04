plugins {
    kotlin("jvm") version "2.1.0"
}

group = "ru.asipes"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.7.5")
    testImplementation("org.testcontainers:testcontainers:1.20.4")
    testImplementation("org.testcontainers:postgresql:1.20.4")
    testImplementation("org.testcontainers:junit-jupiter:1.20.4")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.assertj:assertj-core:3.27.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

sourceSets {
    tasks.withType<ProcessResources> {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }

    test {
        resources {
            srcDirs("src/test/resources")
        }
    }
}