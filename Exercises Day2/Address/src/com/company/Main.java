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
            Address a = new Address(street, streetNumber, city, zipCode);
            System.out.println(a.toString());
        } catch (InvalidZipCode e) {
            System.out.println("The Zip code is invalid");

        }

    }

}
