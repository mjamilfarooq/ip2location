From java
ADD . /workingdir
WORKDIR /workingdir
ENTRYPOINT ["java","-jar","target/ip2location-0.0.1-SNAPSHOT.jar"]

