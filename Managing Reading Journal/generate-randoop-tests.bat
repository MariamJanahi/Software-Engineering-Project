@echo off
rem Generates Randoop regression tests for JournalEntry, JournalStorage and JournalManager.
rem Build the project in IntelliJ first (Build > Build Project).
rem Main is left out because it waits for keyboard input.

set JAVA_BIN=%USERPROFILE%\.jdks\openjdk-27\bin
set RANDOOP_JAR=..\..\tools\randoop-all-4.3.4.jar
set CLASSES=out\production\Managing Reading Journal

"%JAVA_BIN%\java.exe" -classpath "%CLASSES%;%RANDOOP_JAR%" randoop.main.Main gentests ^
  --testclass=JournalEntry --testclass=JournalStorage --testclass=JournalManager ^
  --deterministic --time-limit=0 --generated-limit=1000 ^
  --junit-output-dir=randoop
