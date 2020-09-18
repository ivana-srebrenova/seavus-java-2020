package com.company;

class Address {
    private String street;
    private int streetNumber;
    private String city;
    private int zipCode;


    Address(String street, int streetNumber, String city, int zipCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return this.street + " " + this.streetNumber + " " + this.city + " " + this.zipCode;
    }


}



