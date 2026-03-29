import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "latest.release"
}

group = "io.github.hummel009"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.4.7")
	forge("net.minecraftforge:forge:1.4.7-6.6.2.534:universal@zip")
	mappings("net.minecraftforge:forge:1.4.7-6.6.2.534:src@zip")
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