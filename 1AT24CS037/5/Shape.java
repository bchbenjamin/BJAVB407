/**
 * Create a parent Shape that demonstrates Inheritence.
 * Circle and Triangle
 */
import java.util.*;
public class Shape {
    protected int parameters[];
    protected int drawing = 0;
    Shape(int ...params)
    {
        this.parameters = params;
    }
    Shape()
    {
        this.parameters = null;
    }
    public void draw()
    {
        System.out.println("Drew Shape with parameters "+ Arrays.toString(parameters));
        this.drawing++;
    }
    public void erase()
    {
        System.out.println("Erased the drawing");
        this.drawing--;
    }
}