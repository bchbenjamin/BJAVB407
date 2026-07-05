package DataStructuesAndObjects;
import java.util.Arrays;
public class Circle extends Shape {
    Circle(int ...params)
    {
        super(params);
    }
    @Override
    public void erase()
    {
        System.out.println("Erased the Triangle");
        this.drawing--;
    }
    @Override
    public void draw()
    {
        System.out.println("Drew Triangle with parameters (Length, breadth and height): "+ Arrays.toString(parameters));
        this.drawing++;
    }
}