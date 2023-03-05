plugins {
	java
	war
	id("org.springframework.boot") version "2.7.9"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.pkware"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	
	implementation("org.springframework.boot:spring-boot-starter-web")
	
	runtimeOnly("org.postgresql:postgresql")
	
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	
	implementation("org.springframework.boot:spring-boot-starter-security:2.4.5")
	
	implementation("io.jsonwebtoken:jjwt-api:0.10.5")

	// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api
	implementation("io.jsonwebtoken:jjwt-api:0.10.5")

	// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt
	implementation("io.jsonwebtoken:jjwt:0.9.1")

	// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl
	runtimeOnly("io.jsonwebtoken:jjwt-impl:0.10.5")





}

tasks.withType<Test> {
	useJUnitPlatform()
}
