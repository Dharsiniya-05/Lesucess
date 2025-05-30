import java.util.Scanner;
public class Substring
{
	public static void main(String[] args) {
	    	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String str2 = sc.nextLine();
        String s=str+str;
if(s.contains(str2)){
     System.out.println("True"); 
}
else{
    System.out.println("False");
}
}
}