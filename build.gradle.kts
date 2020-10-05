plugins {
  kotlin("jvm") version "1.3.72"
  kotlin("plugin.spring") version "1.3.72"
  id("org.springframework.boot") version "2.3.3.RELEASE"
  id("io.spring.dependency-management") version "1.0.10.RELEASE"
  id("org.jmailen.kotlinter") version "3.0.2"
  jacoco
}

group = "com.example"
version = "0.0.1"

repositories {
  mavenCentral()
}

val javaVersion = "13"
tasks {
  compileKotlin {
    kotlinOptions.jvmTarget = javaVersion
  }
  compileTestKotlin {
    kotlinOptions.jvmTarget = javaVersion
  }
}


dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.springframework.boot:spring-boot-starter")
}

