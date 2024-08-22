package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullAddress {
    private String houseName;
    private String streetName;
    private String city;

    public FullAddress() {
    }

    public FullAddress(String houseName, String streetName, String city) {
        this.houseName = houseName;
        this.streetName = streetName;
        this.city = city;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
