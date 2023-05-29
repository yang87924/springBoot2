package com.itheima.domain;

import lombok.Data;

//lombok
@Data
public class Food {
    private Integer id;
    private String 	Name;
    private String Address;
    private String Tel;
    private String PicURL;
    private double Latitude;
    private double Longitude;
}