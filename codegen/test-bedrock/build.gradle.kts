/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

description = "Test Build for Bedrock"
extra["displayName"] = "Smithy :: Python :: Aws :: BedrockTest"
extra["moduleName"] = "software.amazon.smithy.python.Aws.BedrockTest"

plugins {
    java
    alias(libs.plugins.smithy.gradle.base)
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(project(":core"))
    implementation(project(":aws:core"))
    implementation(libs.smithy.aws.traits)
    implementation(libs.smithy.aws.endpoints)
}
