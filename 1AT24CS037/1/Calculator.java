import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operator;
        do 
        {
            System.out.println("Enter 2 numbers:");
            a = sc.nextInt(); b= sc.nextInt();
            System.out.print("Enter the operation to be performed: ");
            operator = sc.next().charAt(0);
            switch (operator) {
                case '+'->System.out.println(a+b);
                case '-'->System.out.println(a-b);
                case '*'->System.out.println(a*b);
                case '/'->System.out.println(a/b);
                case '%'->System.out.println(a%b);
            }
            System.out.print("Do you want to continue? (Y/N): ");
        }
        while (sc.next().charAt(0) == 'Y');
        sc.close();
    }
}
