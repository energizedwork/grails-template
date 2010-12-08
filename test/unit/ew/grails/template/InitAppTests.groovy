package ew.grails.template

class InitAppTests extends GroovyTestCase {

	static final String DEFAULT_TEMPLATE_APPLICATION_NAME = "grails-template"

	void testTemplateApplicationIsInitialised() {
		Properties props = new Properties()
		props.load new FileInputStream('application.properties')
		String applicationName = props.getProperty("app.name")

		assertFalse "application name should not be [${DEFAULT_TEMPLATE_APPLICATION_NAME}]", DEFAULT_TEMPLATE_APPLICATION_NAME == applicationName
	}
	
}
