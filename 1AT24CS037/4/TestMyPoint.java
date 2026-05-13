import java.util.Scanner;

/**
 * A class called MyPoint, which models a 2D point with x and y coordinates, is designed as follows:
 * Two instance variable x and y (int).
 * A default constructor that constructs a pair with default values
 * An Overloaded Constructor that constructs a point at the derfault location of (0,0)
 * A method setXY() to set both x and y
 * A method getXY() which returns both x and y in an array
 * an overridden toString()
 * A method called distance(int x and y) that returns the distance from this point to another point called (x, y) co-ordinates
 * an overloaded distance that returns the distance from this point to another
 * another overloaded distance() method that returns the distance from the point to the origin (0,0)
 * 
 * Develop the code for the class MyPoint. Also develop a Java program called TestMyPoint to test all the methods defined in the class
 */

class TestMyPoint {
    public static void main(String[] args) {
        MyPoint a = new MyPoint(1,2);
        MyPoint b = new MyPoint();
        System.out.println(a+"\n"+b);
        MyPoint c = new MyPoint(3,4);
        System.out.println("Distance between point c"+c+" and a"+a+" is: "+a.distance(c));
        System.out.println("Distance between point d(5,6) and a"+a+" is: "+a.distance(5,6));
    }
}