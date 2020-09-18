package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String street = sc.nextLine();
        int streetNumber = sc.nextInt();
        String city = sc.next();
        int zipCode = sc.nextInt();


        try {
            int length = String.valueOf(zipCode).length();
            if (length != 5 && length != 9) {
                throw new InvalidZipCode("The zipCode is invalid");
            }
            Address a = new Address(street, streetNumber, city, zipCode);
            System.out.println(a.toString());

        } catch (InvalidZipCode e) {
            System.out.println("The zipCode is invalid");

        }

    }
}
