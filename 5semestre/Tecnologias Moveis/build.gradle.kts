// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    ext.kotlin_version = '1.5.31'
    ...
}

ext {
    activityVersion = '1.4.0'
    appCompatVersion = '1.4.0'
    constraintLayoutVersion = '2.1.2'
    coreTestingVersion = '2.1.0'
    coroutines = '1.5.2'
    lifecycleVersion = '2.4.0'
    materialVersion = '1.4.0'
    roomVersion = '2.3.0'
    junitVersion = '4.13.2'
    espressoVersion = '3.4.0'
    androidxJunitVersion = '1.1.3'
}


plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}