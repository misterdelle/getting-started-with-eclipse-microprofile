FROM openliberty/open-liberty:kernel-java11-openj9-ubi

COPY --chown=1001:0  target/microprofile-open-tracing-server.war /config/dropins/
COPY --chown=1001:0  server.xml /config/
COPY --chown=1001:0  extension /opt/ol/wlp/usr/extension

RUN configure.sh
