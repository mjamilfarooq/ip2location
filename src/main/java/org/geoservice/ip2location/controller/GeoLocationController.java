package org.geoservice.ip2location.controller;


import org.geoservice.ip2location.entity.GeoLocationIPv4;
import org.geoservice.ip2location.entity.GeoLocationIPv6;
import org.geoservice.ip2location.entity.GeoLocationRecord;
import org.geoservice.ip2location.repository.GeoLocationIPv4Repository;
import org.geoservice.ip2location.repository.GeoLocationIPv6Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.net.UnknownHostException;

@RestController
@RequestMapping(path = "/find", method = RequestMethod.GET)
class GeoLocationController {

    @Autowired
    private GeoLocationIPv6Repository geoLocationIPv6Repository;

    @Autowired
    private GeoLocationIPv4Repository geoLocationIPv4Repository;

    private Long Ipv4StringToLong(String ipv4) {
        String[] ipAddressInArray = ipv4.split("\\.");
        long result = 0;
        long ip;
        for (int x = 3; x >= 0; x--) {
            ip = Long.parseLong(ipAddressInArray[3 - x]);
            result |= ip << (x << 3);
        }
        return result;
    }

    //BigInteger.ZERO will indicate invalid conversion
    private BigInteger Ipv6StringToBigInteger(String ipv6) {
        java.net.InetAddress ia;
        try {
            ia = java.net.InetAddress.getByName(ipv6);
        } catch (UnknownHostException ex) {
            return BigInteger.ZERO;
        }


        byte[] byteArr = ia.getAddress();

        if (ia instanceof java.net.Inet6Address) {
            return new java.math.BigInteger(1, byteArr);
        }


        return BigInteger.ZERO;
    }

    @RequestMapping(path = "/ipv4/{ip}")
    private GeoLocationRecord findGeoLocationFromIpv4(@PathVariable String ip)
    {
        Long ipv4Number = Ipv4StringToLong(ip);
        GeoLocationIPv4 geoLocation = geoLocationIPv4Repository.findIpRange(ipv4Number);

        return geoLocation == null ? null : geoLocation.getRecord();
    }

    @RequestMapping(path = "/ipv6/{ip}")
    public GeoLocationRecord findGeoLocationFromIpv6(@PathVariable String ip)
    {
        BigInteger ipv6Number = Ipv6StringToBigInteger(ip);
        GeoLocationIPv6 geoLocation = geoLocationIPv6Repository.findIpRange(ipv6Number);
        return geoLocation == null ? null : geoLocation.getRecord();
    }
}
