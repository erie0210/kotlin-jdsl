plugins {
    alias(libs.plugins.test.spring.boot3)
    alias(libs.plugins.kotlin.noarg)
    alias(libs.plugins.kotlin.allopen)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}

dependencies {
    @Suppress("VulnerableLibrariesLocal", "RedundantSuppression")
    implementation(libs.test.spring.boot3.jpa)
    implementation(libs.test.spring.boot3.p6spy)
    implementation(projects.example)
    implementation(projects.jpqlDsl)
    implementation(projects.jpqlRender)
    implementation(projects.springDataJpaSupport)

    testImplementation(libs.test.spring.boot3.test)

    testRuntimeOnly(libs.test.h2)
}

kotlin {
    jvmToolchain(17)
}

noArg {
    annotation("com.linecorp.kotlinjdsl.example.jpql.spring.jpa.annotation.CompositeId")
}

allOpen {
    annotation("com.linecorp.kotlinjdsl.example.jpql.spring.jpa.annotation.CompositeId")
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
}