import java.util.Scanner;
public class Count_word
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String[] a=sc.nextLine().split(" ");
	    String b=sc.nextLine();
	    int count=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i].equals(b))
	        {
	            count++;
	        }
	    }
		System.out.println(count);
	}
}
