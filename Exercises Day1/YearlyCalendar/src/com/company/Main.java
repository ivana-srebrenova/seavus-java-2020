package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] daysInYear;
        int year = new Scanner(System.in).nextInt();
        if (year % 4 == 0) {
            daysInYear = new String[366];
        } else {
            daysInYear = new String[365];
        }
        int index = 0;
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int day = 1; day <= 31; day++) {
                        daysInYear[index] = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
                        index++;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    for (int day = 1; day <= 30; day++) {
                        daysInYear[index]=year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
                        index++;
                    }
                    break;
                case 2:
                    if (year % 4 == 0) {

                        for (int day = 1; day <= 29; day++) {
                            daysInYear[index] = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
                            index++;
                        }
                    } else {

                        for (int day = 1; day <= 28; day++) {
                            daysInYear[index] = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
                            index++;
                        }
                    }
                    break;
            }
        }
        for (String elements : daysInYear) {
            System.out.println(elements);
        }
    }
}

