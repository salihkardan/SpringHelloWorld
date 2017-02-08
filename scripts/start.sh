#!/usr/bin/env bash
cd /tmp/codedeploy-deployment-staging-area/
mvn clean install
java -jar hello-world-1.0-SNAPSHOT.jar
