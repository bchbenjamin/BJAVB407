public class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double l, double b)
    {
        length = l; breadth = b;
    }
    @Override
    public double calculateArea()
        {return length * breadth;}
    @Override
    public double calculatePerimeter()
        {return 2 * (length + breadth);}
}
