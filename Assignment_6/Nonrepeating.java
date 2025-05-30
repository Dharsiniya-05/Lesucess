import java.util.Scanner;
public class Nonrepeating
{   static int nonrepeating(String str){
    for(int i=0;i<str.length()-1 ;i++){
        if(str.charAt(i)== str.charAt(i+1)){
            return -1;
        }
       
    }
     return 0;
}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.println(nonrepeating(str));
	}
}
