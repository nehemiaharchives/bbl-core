import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

plugins {
    kotlin("jvm") version "1.9.21"
    id("maven-publish")
}

group = "org.gnit.bible"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

tasks.register<Jar>("sourcesJar") {
    from(sourceSets.main.get().allSource)
    archiveClassifier.set("sources")
}

publishing {
    repositories {
        maven(uri(".m2\\repository")){
            name = project.name
        }
    }

/*    publications.withType<MavenPublication> {
        pom {
            name.set(project.name)
            description.set("Kotlin multiplatform core library for bbl bible software for different platforms")

        }
    }*/

    publications {
        create<MavenPublication>(project.name) {
            groupId = group.toString()
            artifactId = project.name
            version = project.version.toString()
            from(components["java"])
            artifact(tasks.named("sourcesJar"))
        }
    }
}

