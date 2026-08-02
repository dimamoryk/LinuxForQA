#!/bin/bash
echo "Compiling App.java..."
javac -d target/ src/main/java/App.java
echo "Compilation done. Files in target:"
ls -l target/
