import java.util.Scanner;
public class Toggle_Character
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    for(int i=0;i<a.length();i++){
	        char c=a.charAt(i);
	        if(c >= 'A' && c<= 'Z'){
	            b = b + Character.toLowerCase(c);
	        }
	        else{
	             b = b + Character.toUpperCase(c);
	    }
	    }
	    System.out.println(b);
	}
}