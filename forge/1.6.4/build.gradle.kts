import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "latest.release"
}

group = "io.github.hummel009"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.6.4")
	forge("net.minecraftforge:forge:1.6.4-9.11.1.1345:universal")
	mappings("net.minecraftforge:forge:1.6.4-9.11.1.1345:src@zip")
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