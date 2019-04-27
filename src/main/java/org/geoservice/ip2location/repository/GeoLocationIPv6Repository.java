package org.geoservice.ip2location.repository;

import org.geoservice.ip2location.entity.GeoLocationIPv6;
import org.geoservice.ip2location.entity.Ipv6CompositeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;

public interface GeoLocationIPv6Repository extends JpaRepository<GeoLocationIPv6, Ipv6CompositeKey> {

    @Query(value = "SELECT geo FROM GeoLocationIPv6 geo WHERE geo.key.ipFrom <= :ip AND geo.key.ipTo >= :ip")
    GeoLocationIPv6 findIpRange(@Param("ip") BigInteger ip);
}
