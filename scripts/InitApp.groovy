includeTargets << grailsScript("_GrailsArgParsing")
includeTargets << grailsScript("TestApp")

target(main: "The description of the script goes here!") {
    depends(parseArguments, renameApplication, 'default')
}

target(renameApplication: "renames the template app to given project name") {
	String appName = argsMap.appName

	if (appName) {
		event "StatusUpdate", ["\nRenaming template project to ${appName}\n"]
		updateApplicationProperties(appName)
	} else {
		ant.fail(message:"\n **** Please specify application name by adding --appName=<appplication-name> ****\n")
	}
}

void updateApplicationProperties(String appName) {
	Properties props = new Properties()
	props.load new FileInputStream('application.properties')

	props.setProperty("app.name", appName)
	props.store(new FileOutputStream('application.properties'), "Updating appName to ${appName}")
}

setDefaultTarget(main)