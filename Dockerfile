FROM maven:4.0.0-jdk-8-alpine

RUN apk add --update \
    bash
COPY pom.xml /app/
COPY src /app/src
COPY healthcheck.sh /app/
WORKDIR /app/
ENTRYPOINT ["/bin/sh"]
CMD ["healthcheck.sh"]