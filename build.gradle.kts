plugins {
	id("java")
	id("edu.sc.seis.launch4j") version "4.0.0"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.slf4j:slf4j-api:1.7.7")
	testImplementation("junit:junit:4.11")
}

tasks.test {
	useJUnit()
}

launch4j {
	mainClassName = "SwingDemo"
}
