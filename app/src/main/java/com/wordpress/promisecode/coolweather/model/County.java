package com.wordpress.promisecode.coolweather.model;

/**
 * Created by tuyit on 2016/11/23.
 */

public class County {
    private int id;
    private String countyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;

    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    private String countyCode;
    private int cityId;
}
