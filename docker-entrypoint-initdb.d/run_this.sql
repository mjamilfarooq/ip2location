create database IF NOT EXISTS ip2location;

use ip2location;

create table if not exists ipv4
(
	ip_from int(11) NOT NULL,
	ip_to int(11) NOT NULL,
	country_code char(2),
	country varchar(255),
	state varchar(255),
	city varchar(255),
	key `ip_from_ip_to_index` (`ip_from`,`ip_to`)
);

LOAD DATA LOCAL INFILE '/docker-entrypoint-initdb.d/ipv4.csv'
INTO TABLE ipv4
COLUMNS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
ESCAPED BY '"'
LINES TERMINATED BY '\n';


create table if not exists ipv6
(
	ip_from bigint NOT NULL,
	ip_to bigint NOT NULL,
	country_code char(2),
	country varchar(255),
	state varchar(255),
	city varchar(255),
	key `ip_from_ip_to_index` (`ip_from`,`ip_to`)
);

LOAD DATA 
LOCAL INFILE '/docker-entrypoint-initdb.d/ipv6.csv'
INTO TABLE ipv6
COLUMNS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
ESCAPED BY '"'
LINES TERMINATED BY '\n';

