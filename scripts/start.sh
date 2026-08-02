#!/bin/bash
cd ~/linux_workspace/demo-project
nohup java -jar target/demo-0.0.1-SNAPSHOT.jar > app.log 2>&1 &
echo "Application started with PID: $!"
