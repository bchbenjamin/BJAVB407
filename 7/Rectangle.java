public class Rectangle implements Resizable{
    private
        double l, b;
    public Rectangle(double length, double breadth)
    {
        l = length;
        b = breadth;
    }
    @Override
    public void resizeWidth(double width)
    {
        l = width;
        System.out.println("Width resized to "+l);
    }
    @Override
    public void resizeHeight(double height)
    {
        b = height;
        System.out.println("Height resized to "+b);
    }
    @Override
    public String toString()
    {
        String output = "Rectangle (" + super.toString() + "):\n";
        output += "Height: "+b;
        output += "\nWidth: "+ l;
        return output;
    }
}
