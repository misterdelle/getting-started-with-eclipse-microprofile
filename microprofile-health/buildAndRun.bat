@echo off
call mvn clean package
call docker build -t de.rieckpil.udemy/microprofile-health .
call docker rm -f microprofile-health
call docker run -d -p 9080:9080 -p 9443:9443 --name microprofile-health de.rieckpil.udemy/microprofile-health