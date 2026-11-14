#!/bin/bash
# Phase 4: generates Randoop regression tests for the Viewing Reading Status use case.
# How to run: open the IntelliJ Terminal in the project folder, then run:  bash run-randoop.sh
# Before running: Build > Rebuild Project in IntelliJ so the compiled classes are up to date.
# Randoop fails if any folder in its path has a space, so it runs in ~/randoop-work
# and the generated tests are copied back into this project (randoop-tests folder).

set -e
PROJECT="$(pwd)"
WORK="$HOME/randoop-work"
JAR="randoop-all-4.3.3.jar"
CLASSES_DIR="out/production/Viewing Reading Status"

# The classes to generate tests for (the main class is left out because it waits for keyboard input).
printf "ReadingStatus\nReadingStatusRecord\nReadingStatusService\nReadingStatusData\nReadingStatusView\n" > classlist.txt

mkdir -p "$WORK"
rm -rf "$WORK/classes" "$WORK/randoop-tests"
cp -R "$CLASSES_DIR" "$WORK/classes"
cp classlist.txt "$WORK/classlist.txt"

# Download Randoop once.
if [ ! -f "$WORK/$JAR" ]; then
  curl -L -o "$WORK/$JAR" "https://github.com/randoop/randoop/releases/download/v4.3.3/$JAR"
fi

# Generate the regression tests (20 seconds of random testing).
cd "$WORK"
java -classpath "classes:$JAR" randoop.main.Main gentests \
  --classlist=classlist.txt \
  --time-limit=20 \
  --junit-output-dir=randoop-tests \
  --regression-test-basename=ReadingStatusRegression

# Copy the generated tests into the project.
rm -rf "$PROJECT/randoop-tests"
cp -R "$WORK/randoop-tests" "$PROJECT/randoop-tests"
echo "Done. Generated tests are in: $PROJECT/randoop-tests"
