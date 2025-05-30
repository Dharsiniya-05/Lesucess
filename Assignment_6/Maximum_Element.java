import java.util.*;
public class Maximum_Element
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	  
	    int[] arr=new int[n];
	    int count=1;
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	     int temp=arr[0];
	    for(int i=1;i<n;i++){
	         
	        if(count==0){
	            temp=arr[i];
	            count=1;
	        }
	        else if(arr[i]==temp){
	            count++;
	        }
	        else{
	            count--;
	        }
	    }
		System.out.println(temp);
	}
}
