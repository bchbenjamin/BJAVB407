public class Factorial {
    public static int factorial(int number)
    {
        if (number < 0) 
            throw new NegativeNumberError("Can't find factorial of a negative number");
        else if (number == 0) return 1;
        else return number * factorial(number-1);
    }
    public static void main(String[] args) {
        // System.out.print("Enter a number to find the factorial: ");
        int n = -5;
        int factorial=0;
        try 
        {
            factorial = Factorial.factorial(n);
        } 
        catch (NegativeNumberError e) 
        {
            System.out.println("Factorial can't be found for negative numbers!! Taking absolute value...");
            factorial = Factorial.factorial(n * -1);
        }
        finally
        {
            System.out.println("Factorial: "+ factorial);
        }
    }
}
