import java.util.*;

public class Rotation
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	
	for(int i=0;i<k;i++)
	{
	    int temp=arr[0];
	    for(int j=0;j<n-1;j++){
	        arr[j]=arr[j+1];
	    }
	        arr[n-1]=temp;
        }
		System.out.println(Arrays.toString(arr));
	}
}
