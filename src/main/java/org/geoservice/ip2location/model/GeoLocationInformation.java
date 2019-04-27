package org.geoservice.ip2location.model;

import java.io.Serializable;

class GeoLocationInformation implements Serializable {

    private String countryCode;
    private String countryName;
    private String regionName;
    private String cityName;
    private String dataCenterRegion;

    public GeoLocationInformation() {

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
        return "GeoLocationInformation{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", dataCenterRegion='" + dataCenterRegion + '\'' +
                '}';
    }
}
