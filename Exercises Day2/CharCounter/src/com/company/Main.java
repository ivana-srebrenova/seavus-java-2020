package com.company;

import java.util.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws NumberFormatException {
        // TODO Auto-generated method stub
        HashMap<Character, Integer> map = new HashMap<>();
        String line = new Scanner(System.in).nextLine();
        for (int i = 0; i < line.length(); i++) {

            if (map.containsKey(line.charAt(i))) {
                int c = map.get(line.charAt(i));
                map.put(line.charAt(i), c + 1);
            } else {
                map.put(line.charAt(i), 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("The number of occurences of " + entry.getKey() + " " + "is: " + " " + entry.getValue());
        }
    }


}
