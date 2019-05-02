package org.geoservice.ip2location.repository;

import org.geoservice.ip2location.entity.GeoLocationIPv4;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class GeoLocationRepositoryImpl implements GeoLocationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public GeoLocationIPv4 findIpRange(Long ip) {
        Query query = entityManager.createNativeQuery(String.format("SELECT * FROM ipv4 WHERE ip_from <=%d AND ip_to >=%d", ip, ip), GeoLocationIPv4.class);
        StopWatch stopWatch = new StopWatch("GeoLocationIP_Watch");
        stopWatch.start("findIpRange.query.execute");
        Optional result = query.getResultStream().findFirst();
        stopWatch.stop();
        System.out.println("Query Execution Time " + stopWatch.prettyPrint());

        return result.isPresent()? (GeoLocationIPv4) result.get() : null;



    }
}
