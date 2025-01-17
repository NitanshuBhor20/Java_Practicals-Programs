import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:");
        int y = sc.nextInt();
        System.out.println("Arithmetic Operations are:");
        //Addition
        int add = x + y;
        System.out.println("Addition is: " +add);
        //Subtraction
        int sub = x - y;
        System.out.println("Subtraction is: " +sub);
        //Multiplication
        int mul = x * y;
        System.out.println("Multiplication is: " +mul);
        //Division
        int div = x / y;
        System.out.println("Division is: " +div);
        //Modulus
        int mod = x % y;
        System.out.println("Modulus is: " +mod);
    }
}