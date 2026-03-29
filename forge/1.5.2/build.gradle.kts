import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "latest.release"
}

group = "io.github.hummel009"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.5.2")
	forge("net.minecraftforge:forge:1.5.2-7.8.1.738:universal@zip")
	mappings("net.minecraftforge:forge:1.5.2-7.8.1.738:src@zip")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(11)
	}
}

tasks {
	compileJava {
		options.release.set(6)
	}
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}