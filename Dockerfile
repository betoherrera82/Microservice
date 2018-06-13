FROM maven:3.5-jdk-8

RUN mkdir -p /deploy/application

VOLUME ["/deploy/application"]

WORKDIR /deploy/application

ADD Microservice .

ENTRYPOINT ["mvn","clean","package"]