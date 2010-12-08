appName = grails.util.Metadata.current.getApplicationName()

grails.serverURL = "http://${appname}.energizedwork.com"

dataSource {
	dbCreate = "update"
	url = "jdbc:hsqldb:file:${appName};shutdown=true"
}