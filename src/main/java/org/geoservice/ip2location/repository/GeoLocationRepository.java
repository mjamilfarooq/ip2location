package org.geoservice.ip2location.repository;

import org.geoservice.ip2location.entity.GeoLocationIPv4;
import org.springframework.data.repository.query.Param;

public interface GeoLocationRepository {
    GeoLocationIPv4 findIpRange(@Param("ip") Long ip);
}
