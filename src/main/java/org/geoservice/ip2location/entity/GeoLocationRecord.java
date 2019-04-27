package org.geoservice.ip2location.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GeoLocationRecord {
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "datacenter_region")
    private String dataCenterRegion;

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

    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    public void setDataCenterRegion(String dataCenterRegion) {
        this.dataCenterRegion = dataCenterRegion;
    }

    @Override
    public String toString() {
        return "GeoLocationRecord{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", dataCenterRegion='" + dataCenterRegion + '\'' +
                '}';
    }
}
