package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // write your code here

        String str = new Scanner(System.in).nextLine();
        String[] word;
        word = str.split(" ");
        String number = "";
        for (int i = 0; i < word.length; i++) {
            switch (word[i]) {
                case "zero":
                    number += "0";
                    break;
                case "one":
                    number += "1";
                    break;
                case "two":
                    number += "2";
                    break;
                case "three":
                    number += "3";
                    break;
                case "four":
                    number += "4";
                    break;
                case "five":
                    number += "5";
                    break;
                case "six":
                    number += "6";
                    break;
                case "seven":
                    number += "7";
                    break;
                case "eight":
                    number += "8";
                    break;
                case "nine":
                    number += "9";
                    break;

            }
        }
        int result = Integer.parseInt(number);
        System.out.println(result);


    }


}
