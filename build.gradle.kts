plugins {
  kotlin("jvm") version "1.3.72" apply false
  kotlin("plugin.spring") version "1.3.72" apply false
  kotlin("kapt") version "1.3.72" apply false
  id("com.autonomousapps.dependency-analysis") version "0.53.1"
}

tasks.wrapper {
  gradleVersion = "6.3"
  distributionType = Wrapper.DistributionType.ALL
}
