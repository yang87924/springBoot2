package com.itheima.domain;

public class food {
    private Integer id;
    private String 	Name;
    private String Address;
    private String Tel;
    private String PicURL;
    private double 	Latitude;
    private double Longitude;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Tel='" + Tel + '\'' +
                ", PicURL='" + PicURL + '\'' +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getPicURL() {
        return PicURL;
    }

    public void setPicURL(String picURL) {
        PicURL = picURL;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
