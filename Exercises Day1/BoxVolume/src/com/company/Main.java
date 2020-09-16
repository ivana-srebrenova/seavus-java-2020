package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner str=new Scanner(System.in);
        int height=str.nextInt();
        int width=str.nextInt();
        int depth=str.nextInt();
        Box b=new Box(height,width,depth);
        System.out.println("The volume is " + b.volume());


    }

}
