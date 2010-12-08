package ew.grails.template

import grails.util.Metadata
import org.springframework.core.io.ClassPathResource

class InitAppTests extends GroovyTestCase {

	static final String DEFAULT_TEMPLATE_APPLICATION_NAME = "grails-template"

	void testTemplateApplicationPropertiesHasBeenRenamed() {
		println "meta data file :${Metadata.FILE}"
		Metadata metadata = Metadata.getInstance(new File(Metadata.FILE))
		String applicationName = metadata.getApplicationName()
		println "grails application name is ${applicationName}"
		assertNotNull applicationName
		assertFalse "application name should not be [${DEFAULT_TEMPLATE_APPLICATION_NAME}]", DEFAULT_TEMPLATE_APPLICATION_NAME == applicationName
	}
}
