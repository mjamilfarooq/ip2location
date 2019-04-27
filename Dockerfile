From maven
ADD . /workingdir
WORKDIR /workingdir
ENTRYPOINT ["mvn","spring-boot:run"]

