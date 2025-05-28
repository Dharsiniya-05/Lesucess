import java.util.Scanner;
public class Bitwise
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    
		System.out.println("Bitwise AND: "+ (a&b));
		System.out.println("Bitwise OR: " + (a|b));
		System.out.println("Bitwise XOR: " +(a^b));
		System.out.println("Left shift of a by 2:" +(a<<2));
		System.out.println("Left shift of b by 2: " +(b<<2));
		System.out.println("Right shift of a by 2: " +(a>>2));
		System.out.println("Right shift of b by 2: " +(b>>2));
		
		
	}
}
