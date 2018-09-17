package com.company;
class Ball {

    int size;
    String color;

    Ball()
    {
        size =0;
        color = "no";
    }
    Ball(int getSize, String getColor)
    {
        size = getSize;
        color = getColor;
    }

    int getSize()
    {
        return size;
    }
    void setSize(int arg)
    {
        size = arg;
    }
    String getColor()
    {
        return color;
    }
    void setColor(String arg)
    {
        color = arg;
    }

}

public class Main {
    public static void main(String[] args)
    {
        Ball ball = new Ball(15, "green");
        System.out.println("ball " + ball.getSize() + " " + ball.getColor());


    }
}