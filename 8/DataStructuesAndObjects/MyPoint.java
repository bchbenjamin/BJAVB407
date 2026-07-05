package DataStructuesAndObjects;
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

public class MyPoint {
    public int x, y;
    MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int[] getXY()
        {return new int[]{x,y};}
    @Override
    public String toString()
        {return "("+this.x+","+this.y+")";}
    public double distance(int x, int y)
    {
        double d = Math.sqrt(
            (this.y - y) * (this.y - y) +
            (this.x - x) * (this.x - x)
        );
        return d;
    }
    public double distance(MyPoint another)
        {return this.distance(another.x, another.y);}
}