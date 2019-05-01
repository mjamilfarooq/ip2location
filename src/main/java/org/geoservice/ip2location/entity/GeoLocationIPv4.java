package org.geoservice.ip2location.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Table(name = "ipv4")
public class GeoLocationIPv4 {

    @EmbeddedId
    @JsonIgnore
    private Ipv4CompositeKey key;

    @Embedded
    private GeoLocationRecord record;

    public GeoLocationIPv4()
    {
    }


    public Ipv4CompositeKey getKey() {
        return key;
    }

    public void setKey(Ipv4CompositeKey key) {
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
        return "GeoLocationIPv4{" +
                "key=" + key +
                ", record=" + record +
                '}';
    }
}
