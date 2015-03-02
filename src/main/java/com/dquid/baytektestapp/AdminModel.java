package com.dquid.baytektestapp;

/**
 * Created by shobhitg on 2/28/2015.
 */
public class AdminModel {
    private String serial;
    private String deviceName;
    private String photoUrl;

    public AdminModel(String serial, String deviceName, String photoUrl) {
        this.serial = serial;
        this.deviceName = deviceName;
        this.photoUrl = photoUrl;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
