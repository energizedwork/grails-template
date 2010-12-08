includeTargets << grailsScript("_GrailsArgParsing")
includeTargets << grailsScript("TestApp")

target(main: "The description of the script goes here!") {
    depends(parseArguments, renameApplication)
}

target(renameApplication: "renames the template app to given project name") {
	String appName = argsMap.appName
	event "StatusUpdate", ["Renaming template project to ${appName}"]
}

setDefaultTarget(main)git 