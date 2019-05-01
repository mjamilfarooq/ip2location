package org.geoservice.ip2location.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GeoLocationRecord {
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country")
    private String countryName;

    @Column(name = "state")
    private String regionName;

    @Column(name = "city")
    private String cityName;


    public GeoLocationRecord ()
    {

    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "GeoLocationRecord{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
