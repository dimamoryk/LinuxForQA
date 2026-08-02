#!/bin/bash
PID=$(pgrep -f demo-0.0.1-SNAPSHOT.jar)
if [ -n "$PID" ]; then
     kill $PID
     echo "Application stopped (PID: $PID)"
else
     echo "Application not running"
fi
