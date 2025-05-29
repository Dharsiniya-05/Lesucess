import java.util.Scanner;
public class Substring
{
    static int occur(String str,char ch){
        if(str.length()==0){
            return 0;
        }
        if (str.charAt(0) == ch) {
            return 1+occur(str.substring(1),ch); 
        } else {
            return occur(str.substring(1),ch); 
            
        }
    }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     String str=sc.nextLine();
	     char ch=sc.next().charAt(0);
	     
		System.out.println(occur(str,ch));
	}
}
