package com.company;
class Box {

    private int height;
    private int width;
    private int depth;

    Box(int height, int width, int depth) {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    int volume(){
        return (this.height*this.width*this.depth);
    }

}
