package org.geoservice.ip2location.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Ipv4CompositeKey implements Serializable {

    @Column(name = "ip_from")
    private Long ipFrom;

    @Column(name = "ip_to")
    private Long ipTo;

    public Ipv4CompositeKey() {

    }

    public Ipv4CompositeKey(Long ipFrom, Long ipTo) {
        this.ipFrom = ipFrom;
        this.ipTo = ipTo;
    }


    public Long getIpFrom() {
        return ipFrom;
    }

    public void setIpFrom(Long ipFrom) {
        this.ipFrom = ipFrom;
    }

    public Long getIpTo() {
        return ipTo;
    }

    public void setIpTo(Long ipTo) {
        this.ipTo = ipTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ipv4CompositeKey that = (Ipv4CompositeKey) o;
        return Objects.equals(ipFrom, that.ipFrom) &&
                Objects.equals(ipTo, that.ipTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ipFrom, ipTo);
    }

    @Override
    public String toString() {
        return "Ipv4CompositeKey{" +
                "ipFrom=" + ipFrom +
                ", ipTo=" + ipTo +
                '}';
    }
}
