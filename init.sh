#!/usr/bin/env bash
./gradlew stage

java -jar build/server/webapp-runner-*.jar build/libs/*.war --port 5000