import java.util.Scanner;
public class Duplicate_string
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		String a=sc.nextLine().toLowerCase();
		String b="";
	
		for( int i=0;i<a.length();i++){
		    char c=a.charAt(i);
		    if(b.indexOf(c)==-1){
		        b=b+c;
		    }
		    }
		
		System.out.print(b);
		}
	}
