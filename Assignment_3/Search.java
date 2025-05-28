import java.util.Scanner;
public class Search
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int[] ar=new int [n];
	    for(int i=0;i<n;i++)
	    {
	        ar[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    boolean find=false;
	    for(int i=0;i<n;i++){
	        if(ar[i]==k){
	            System.out.println(i);
	            find=true;
	            break;
	        }
	    }
	    if(!find){
	        System.out.println("Not Found");
	    }

        }
	}

