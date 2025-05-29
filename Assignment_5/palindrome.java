import java.util.Scanner;
public class palindrome
{
    static boolean palindrome(String str,int i,int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;}
            return palindrome(str,i+1,j-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    if(palindrome(str,0,str.length()-1)){
		System.out.println("Yes");
	    }
		else{
		    System.out.println("No");
		}
	}
}

