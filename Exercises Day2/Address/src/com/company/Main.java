package com.company;

import java.util.Scanner;

class InvalidZipCode extends Exception {
    InvalidZipCode(String s) {
        super(s);
    }
}

class Address {
    String street;
    int streetNumber;
    String city;
    int zipCode;

    public Address(String street, int streetNumber, String city, int zipCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + " " + streetNumber + " " + city + " " + zipCode;
    }

    public void valid(int zipCode) throws InvalidZipCode {
        int length = String.valueOf(zipCode).length();
        if (length != 5 && length != 9) {
            throw new InvalidZipCode("The zipCode is invalid");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String street = sc.nextLine();
        int streetNumber = sc.nextInt();
        String city = sc.next();
        int zipCode = sc.nextInt();
        Address a = new Address(street, streetNumber, city, zipCode);

        try {
            a.valid(zipCode);
            System.out.println(a.toString());
        } catch (InvalidZipCode e) {
            System.out.println("The zipCode is invalid");

        }

    }
}