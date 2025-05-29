import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		String a=sc.nextLine().toLowerCase();
		int v=0,c=0;
		for(int i=0;i<a.length();i++){
		    char ch=a.charAt(i);
		    if(Character.isLetter(ch)){
		    
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		    v++;
		}
		
		else{
		    c++;
		}
		}
		}
		System.out.println("Vowels "+ v +" Consonants "+ c);
	}
}
