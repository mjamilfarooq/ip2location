package org.geoservice.ip2location.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ipv6")
public class GeoLocationIPv6 {

    @EmbeddedId
    @JsonIgnore
    private Ipv6CompositeKey key;

    @Embedded
    private GeoLocationRecord record;

    public GeoLocationIPv6() {

    }

    public Ipv6CompositeKey getKey() {
        return key;
    }

    public void setKey(Ipv6CompositeKey key) {
        this.key = key;
    }

    public GeoLocationRecord getRecord() {
        return record;
    }

    public void setRecord(GeoLocationRecord record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "GeoLocationIPv6{" +
                "key=" + key +
                ", record=" + record +
                '}';
    }
}
