plugins { kotlin("jvm") version "2.1.0"; application }
repositories { mavenCentral() }
dependencies { implementation("io.ktor:ktor-server-core-jvm:3.0.3"); implementation("io.ktor:ktor-server-netty-jvm:3.0.3"); implementation("org.postgresql:postgresql:42.7.5"); implementation("com.rabbitmq:amqp-client:5.24.0"); testImplementation(kotlin("test")) }
