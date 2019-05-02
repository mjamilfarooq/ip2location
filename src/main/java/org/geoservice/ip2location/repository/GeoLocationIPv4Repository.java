package org.geoservice.ip2location.repository;

import org.geoservice.ip2location.entity.GeoLocationIPv4;
import org.geoservice.ip2location.entity.Ipv4CompositeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface GeoLocationIPv4Repository extends JpaRepository<GeoLocationIPv4, Ipv4CompositeKey>, GeoLocationRepository {


//    @Query(value = "SELECT geo FROM GeoLocationIPv4 geo WHERE geo.key.ipFrom <= :ip AND geo.key.ipTo >= :ip")
////    @Query(value = "SELECT * FROM ip2location_db3 WHERE ip_from <= :ip AND ip_to >= :ip", nativeQuery = true)
//    GeoLocationIPv4 findIpRange(@Param("ip") Long ip);
}
