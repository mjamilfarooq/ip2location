#!/usr/bin/env bash


echo -n 'data loading'
while [[ 1 -eq 1 ]]
do

    dbcount=$(echo `mysql -uroot -pmypassword -h ip2location-mysql -Dip2location -e "select count(*) from ipv6";`|cut -f2 -d' ')
    fscount=`wc --lines docker-entrypoint-initdb.d/ipv6.csv|cut -f1 -d' '`

    if [[ dbcount -eq fscount ]]
    then
        echo 'done!!'
        break;
    fi
    sleep 1m;
    echo -n '..';
done
    echo 'starting webservice';
    java -jar target/ip2location-0.0.1-SNAPSHOT.jar