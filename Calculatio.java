import java.util.Scanner;
public class Calculation{
public static void main(String[] args)
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the first number ");
float a = Sc.nextInt();
System.out.println("Enter the Second number ");
float b = Sc.nextInt();
float sum;
sum = a+b;
float sub;
sub = a-b;
float product;
product = a*b;
float division;
division = a/b;
System.out.println("Sum of 2 Numbers = "+sum);
System.out.println("Substraction of 2 Numbers = "+sub);
System.out.println("Product of 2 Numbers = "+product);
System.out.println("Division of 2 Numbers = "+division);
}
}
