package com.example.firma.testapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by firman on 20-Mar-18.
 */

public class ListModel {
    @SerializedName("executionTime")
    @Expose
    private String executionTime;
    @SerializedName("stationBeanList")
    @Expose
    private List<StationBeanList> stationBeanList = null;

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public List<StationBeanList> getStationBeanList() {
        return stationBeanList;
    }

    public void setStationBeanList(List<StationBeanList> stationBeanList) {
        this.stationBeanList = stationBeanList;
    }

    public class StationBeanList {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("stationName")
        @Expose
        private String stationName;
        @SerializedName("availableDocks")
        @Expose
        private Integer availableDocks;
        @SerializedName("totalDocks")
        @Expose
        private Integer totalDocks;
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("statusValue")
        @Expose
        private String statusValue;
        @SerializedName("statusKey")
        @Expose
        private Integer statusKey;
        @SerializedName("availableBikes")
        @Expose
        private Integer availableBikes;
        @SerializedName("stAddress1")
        @Expose
        private String stAddress1;
        @SerializedName("stAddress2")
        @Expose
        private String stAddress2;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("postalCode")
        @Expose
        private String postalCode;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("altitude")
        @Expose
        private String altitude;
        @SerializedName("testStation")
        @Expose
        private Boolean testStation;
        @SerializedName("lastCommunicationTime")
        @Expose
        private String lastCommunicationTime;
        @SerializedName("landMark")
        @Expose
        private String landMark;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getStationName() {
            return stationName;
        }

        public void setStationName(String stationName) {
            this.stationName = stationName;
        }

        public Integer getAvailableDocks() {
            return availableDocks;
        }

        public void setAvailableDocks(Integer availableDocks) {
            this.availableDocks = availableDocks;
        }

        public Integer getTotalDocks() {
            return totalDocks;
        }

        public void setTotalDocks(Integer totalDocks) {
            this.totalDocks = totalDocks;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public String getStatusValue() {
            return statusValue;
        }

        public void setStatusValue(String statusValue) {
            this.statusValue = statusValue;
        }

        public Integer getStatusKey() {
            return statusKey;
        }

        public void setStatusKey(Integer statusKey) {
            this.statusKey = statusKey;
        }

        public Integer getAvailableBikes() {
            return availableBikes;
        }

        public void setAvailableBikes(Integer availableBikes) {
            this.availableBikes = availableBikes;
        }

        public String getStAddress1() {
            return stAddress1;
        }

        public void setStAddress1(String stAddress1) {
            this.stAddress1 = stAddress1;
        }

        public String getStAddress2() {
            return stAddress2;
        }

        public void setStAddress2(String stAddress2) {
            this.stAddress2 = stAddress2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getAltitude() {
            return altitude;
        }

        public void setAltitude(String altitude) {
            this.altitude = altitude;
        }

        public Boolean getTestStation() {
            return testStation;
        }

        public void setTestStation(Boolean testStation) {
            this.testStation = testStation;
        }

        public String getLastCommunicationTime() {
            return lastCommunicationTime;
        }

        public void setLastCommunicationTime(String lastCommunicationTime) {
            this.lastCommunicationTime = lastCommunicationTime;
        }

        public String getLandMark() {
            return landMark;
        }

        public void setLandMark(String landMark) {
            this.landMark = landMark;
        }

    }

}

