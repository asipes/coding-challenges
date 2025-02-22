plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "coding-challenges"

include("java")
project(":java").projectDir = file("java")

include("sql")
project(":sql").projectDir = file("sql")

include("python")
project(":python").projectDir = file("python")

include("golang")
project(":golang").projectDir = file("golang")
