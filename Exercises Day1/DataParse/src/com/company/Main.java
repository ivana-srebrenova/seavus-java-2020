package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        String str = new Scanner(System.in).nextLine();
        String month = str.substring(0, 2);
        String day = str.substring(3, 5);
        String year = str.substring(6, 10);

        System.out.println(month);
        System.out.println(day);
        System.out.println(year);


    }
}
