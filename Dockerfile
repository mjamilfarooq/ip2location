FROM oracle/openjdk
ADD . /workingdir
WORKDIR /workingdir
RUN yum -y update
RUN yum -y install mysql
#ENTRYPOINT ["java","-jar","target/ip2location-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["./service_start.sh"]
