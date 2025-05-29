import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b="";
		for(int i=0;i<a.length();i++){
		  
		    b=a.charAt(i)+b;
		   
		}
		if(a.equals(b)){
		    System.out.println("Palindrome");
		}
		else{
		    
		
		System.out.println("Not Palindrome");
		
	}
}}
