package righttriangletester;

import java.util.Scanner;

public class RightTriangleTester 
{
    double x, y;

    public static void main(String[] args) 
    {
        RightTriangle triangle1 = new RightTriangle();
        RightTriangle triangle2 = new RightTriangle(2,4);
        RightTriangle triangle3 = new RightTriangle(4,8);
        
        System.out.println("Triangle 1");
        System.out.println("----------");
        System.out.print("Base: ");
        System.out.println(triangle1.getBase());
        System.out.print("Height: ");
        System.out.println(triangle1.getHeight());
        System.out.print("Area: ");
        System.out.println(triangle1.calculateArea());
        System.out.println("");
        System.out.println("Triangle 2");
        System.out.println("----------");
        System.out.print("Base: ");
        System.out.println(triangle2.getBase());
        System.out.print("Height: ");
        System.out.println(triangle2.getHeight());
        System.out.print("Area: ");
        System.out.println(triangle2.calculateArea());
        System.out.println("");
        System.out.println("Triangle 3");
        System.out.println("----------");
        System.out.print("Base: ");
        System.out.println(triangle3.getBase());
        System.out.print("Height: ");
        System.out.println(triangle3.getHeight());
        System.out.print("Area: ");
        System.out.println(triangle3.calculateArea());
        System.out.println("");
    }
}