plugins {
    alias(exampleLibs.plugins.kotlin.noarg)
    alias(exampleLibs.plugins.kotlin.allopen)
    alias(exampleLibs.plugins.kotlin.jpa)
}

dependencies {
    implementation(exampleLibs.eclipselink4)
    implementation(exampleLibs.logback)
    implementation(projects.example)
    implementation(projects.jpqlDsl)
    implementation(projects.jpqlRender)
    implementation(projects.eclipselinkSupport)

    runtimeOnly(exampleLibs.h2)

    testFixturesImplementation(exampleLibs.eclipselink4)
    testFixturesImplementation(projects.jpqlRender)
}

kotlin {
    jvmToolchain(17)
}

noArg {
    annotation("com.linecorp.kotlinjdsl.example.eclipselink.annotation.CompositeId")
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
}

allOpen {
    annotation("com.linecorp.kotlinjdsl.example.eclipselink.annotation.CompositeId")
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
}

tasks.withType<PublishToMavenRepository>().configureEach { enabled = false }
tasks.withType<PublishToMavenLocal>().configureEach { enabled = false }
