appName = grails.util.Metadata.current.getApplicationName()

grails.serverURL = "http://localhost:8080/${appName}"

dataSource {
	dbCreate = "update"
	url = "jdbc:hsqldb:mem:${appName}_test"
}