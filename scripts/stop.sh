#!/bin/bash

kill -9 `ps axu  | grep hello-world-1.0-SNAPSHOT.jar | head -1 | awk {'print $2'}`
