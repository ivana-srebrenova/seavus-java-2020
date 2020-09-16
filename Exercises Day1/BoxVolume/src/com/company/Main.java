package com.company;
import java.util.*;
class Box{
    int height;
    int width;
    int depth;

    Box(int height, int width, int depth) {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    int volume(int height,int width,int depth){
        return height*width*depth;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner str=new Scanner(System.in);
        int height=str.nextInt();
        int width=str.nextInt();
        int depth=str.nextInt();
        Box b=new Box(height,width,depth);
        System.out.println("The volume is " + b.volume(height,width,depth));


    }

}
