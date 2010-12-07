grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
	inherits("global") {
		// uncomment to disable ehcache
		// excludes 'ehcache'
	}
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsPlugins()
		grailsCentral()
		grailsHome()
		mavenCentral()
		mavenLocal()
		mavenRepo "http://build.disney.ew/artifactory/repo"
	}
	dependencies {
		// provided "mysql:mysql-connector-java:5.1.8"
		runtime "postgresql:postgresql:8.2-507.jdbc4"
	}
	plugins {
		compile ":hibernate:1.3.5"
		compile ":joda-time:1.2-SNAPSHOT"
		compile ":cache-headers:1.1.2"
		build ":bean-fields:1.0-RC3"
		build ":tomcat:1.3.5"
		build ":liquibase:1.9.3.3"
		runtime ":plugins.jquery:1.4.2.5"
		runtime ":plugins.jquery-ui:1.8.4.3"
		test ":spock:0.5-groovy-1.7-SNAPSHOT"
		test ":build-test-data:1.1.1"
		test ":fixtures:1.0.1"
		test "com.energizedwork:remote-fixtures:1.0.1-SNAPSHOT"
	}
}