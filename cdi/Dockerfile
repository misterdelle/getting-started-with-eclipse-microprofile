FROM openliberty/open-liberty:kernel-java11-openj9-ubi

COPY --chown=1001:0  target/cdi.war /config/dropins/
COPY --chown=1001:0  target/server.xml /config

RUN configure.sh