import java.util.*;
public class Capitalized
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String[] a=sc.nextLine().toLowerCase().split(" ");
	    String b="";
	   
	    for(int i=0;i<a.length;i++){
	        
	        if(a[i].length()>0){
	            b=b+ a[i].substring(0,1).toUpperCase() + a[i].substring(1)+" ";
	        }
	}
	System.out.println(b);
}
	    }