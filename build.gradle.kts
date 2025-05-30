plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.cloud:google-cloud-vertexai:1.23.0")
}

application {
    mainClass = "org.example.Main"
}

tasks.test {
    useJUnitPlatform()
}