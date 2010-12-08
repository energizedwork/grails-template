appName = grails.util.Metadata.current.getApplicationName()

grails.serverURL = "http://localhost:8080/${appName}"
dataSource {
	dbCreate = "create-drop" // one of 'create', 'create-drop','update'
	url = "jdbc:hsqldb:mem:${appName}"
}