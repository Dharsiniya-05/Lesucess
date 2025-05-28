import java.util.Scanner;
public class Type_conversion
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int integer=sc.nextInt();
	    float f=sc.nextFloat();
	    char ch=sc.next().charAt(0);
	    
		System.out.println("sum of integer conv to float and float "+ ((float)integer+f));
		System.out.println("sum of Character to Ascii value and integer "+ ((int)ch+integer));
	}
}
