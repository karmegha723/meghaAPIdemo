package org.example.pojo;

import java.util.List;

public class LocationDetails {
    private Location location;
    private int accuracy;
    private  String name;
    private String phone_number;
    private String address;
    private List<String> types;
    private String website;
    private String language;
    public Location getLocation() {
        return location;
    }

    // Setter
    public void setLocation(Location newName) {
        this.location = newName;
    }
    public int getAccuracy() {
        return accuracy;
    }

    // Setter
    public void setAccuracy(int newName) {
        this.accuracy = newName;
    }
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public String getPhone_number() {
        return phone_number;
    }

    // Setter
    public void setPhone_number(String newName) {
        this.phone_number = newName;
    }
    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String newName) {
        this.address = newName;
    }
    public List<String> getTypes() {
        return types;
    }

    // Setter
    public void setTypes(List<String> newName) {
        this.types = newName;
    }
    public String getWebsite() {
        return website;
    }

    // Setter
    public void setWebsite(String newName) {
        this.website = newName;
    }
    public String getLanguage() {
        return language;
    }

    // Setter
    public void setLanguage(String newName) {
        this.language = newName;
    }
}
