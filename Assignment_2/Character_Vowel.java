import java.util.Scanner;
public class Character_Vowel
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char ch=sc.next().charAt(0);
	    char c=Character.toLowerCase(ch);
	    if(!Character.isLetter(c))
	    {
	        System.out.println("Not a valid Character");
	    }
	    
	    else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	    {
	        System.out.println(c+" is vowel");
	    }
	    else{
		System.out.println(c+" is Consonant");
	    }
	}
}
