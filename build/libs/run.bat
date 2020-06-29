@ECHO OFF
java -Xms1000M -Xmx1000M -DIReallyKnowWhatIAmDoingISwear -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar ./fuckedspigot.jar
pause