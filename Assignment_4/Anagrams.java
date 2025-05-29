import java.util.*;
public class Anagrams
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine().toLowerCase();
	    String b=sc.nextLine().toLowerCase();
	            if(a.length()!=b.length()){
            System.out.println("Not c");
            return;
        }
        String temp=b;
        for(int i=0;i<a.length();i++){
            boolean found=false;
            for(int j=0;j<temp.length();j++){
                if(a.charAt(i)==temp.charAt(j)){
                    temp=temp.substring(0,j)+temp.substring(j+1);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
