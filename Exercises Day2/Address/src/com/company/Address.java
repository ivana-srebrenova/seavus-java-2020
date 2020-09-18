package com.company;

class Address {
    private String street;
    private int streetNumber;
    private String city;
    private int zipCode;

    Address(String street, int streetNumber, String city, int zipCode) throws InvalidZipCode {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;

        if (String.valueOf(zipCode).length() != 5 && String.valueOf(zipCode).length() != 9) {
            throw new InvalidZipCode("Invalid zip code");

        } else {
            this.zipCode = zipCode;

        }
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

}




