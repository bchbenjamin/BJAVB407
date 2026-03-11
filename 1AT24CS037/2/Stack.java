import java.util.*;
public class Stack 
{
    private int size;
    private int stackArray[];
    private int top;
    Stack(int size)
    {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public int pop()
    {
        if (this.top == -1)
        {
            System.err.println("Stack Overflow!!");
            return -1;
        }
        return this.stackArray[this.top--];
    }

    public void push(int ele)
    {
        if (this.top >= this.size)
        {
            System.err.println("Stack Overflow!!");
            return;
        }
        this.stackArray[++this.top] = ele;
    }

    public int peek() {return this.stackArray[this.top];}

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum capacity of the stack: ");
        Stack stack = new Stack(sc.nextInt());
        while (true) {
            System.out.print("Enter a choice:\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\nChoice: ");
            switch (sc.nextInt()) {
                case 1->{
                    System.out.print("Enter the element to be pushed: ");
                    stack.push(sc.nextInt());
                }
                case 2->System.out.println("The removed element is "+ stack.pop());
                case 3->System.out.println("Top: "+stack.peek());
                case 4->System.out.println(stack);
                case 5->{
                    sc.close();
                    return;
                }
                default->{
                    sc.close();
                    return;
                }
            }
        }
    }
}