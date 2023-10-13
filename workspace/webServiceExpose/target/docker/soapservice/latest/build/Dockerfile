FROM quay.io/jkube/jkube-java-binary-s2i:0.0.8
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="Soap service to create customer" org.label-schema.version=1.0.0-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2023-05-08T18:33:34.097009 org.label-schema.name="SOAP Service"
EXPOSE 8080 8778 9779
COPY /deployments /deployments/
