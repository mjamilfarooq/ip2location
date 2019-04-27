package org.geoservice.ip2location.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigInteger;

@Embeddable
public class Ipv6CompositeKey implements Serializable {

    @Column(name = "ip_from")
    private BigInteger ipFrom;

    @Column(name = "ip_to")
    private BigInteger ipTo;

    public Ipv6CompositeKey()
    {

    }

    public Ipv6CompositeKey(BigInteger ipFrom, BigInteger ipTo) {
        this.ipFrom = ipFrom;
        this.ipTo = ipTo;
    }

    public BigInteger getIpFrom() {
        return ipFrom;
    }

    public void setIpFrom(BigInteger ipFrom) {
        this.ipFrom = ipFrom;
    }

    public BigInteger getIpTo() {
        return ipTo;
    }

    public void setIpTo(BigInteger ipTo) {
        this.ipTo = ipTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ipv6CompositeKey that = (Ipv6CompositeKey) o;

        if (!ipFrom.equals(that.ipFrom)) return false;
        return ipTo.equals(that.ipTo);
    }

    @Override
    public int hashCode() {
        int result = ipFrom.hashCode();
        result = 31 * result + ipTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ipv6CompositeKey{" +
                "ipFrom=" + ipFrom +
                ", ipTo=" + ipTo +
                '}';
    }
}
