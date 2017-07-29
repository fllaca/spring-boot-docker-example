#!/bin/sh

echo "Execute extra initializations before running the application..."

# Runs the application
/bin/sh -l -c "$*"
