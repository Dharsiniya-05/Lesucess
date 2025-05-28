import java.util.Scanner;
public class Duplicate
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	     for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]==arr[j]){
	                System.out.print(arr[i]+" ");
	                count++;
	                continue;
	            }
	        }
	    }
	    if(count==0){
	             System.out.println("No duplicates");
	    }
	   
	}
}
