import java.util.Scanner;
public class Arithmetic_Expression
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    double c=sc.nextDouble();
	    
	    int d=a+b;
	    
		System.out.println("Addition:"+ d);
		System.out.println("Subtraction:" + (a-b));
		System.out.println("Multiplication:" +(a*b));
		System.out.println("Division:" +(a/b));
		
		System.out.println("Multiply the result of the addition with the double value. "+ ((double)d*c));
	}
}
