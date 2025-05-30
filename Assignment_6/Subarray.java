import java.util.Scanner;
public class Subarray
{
    static int find(int[] ar){
        int res=ar[0];
        for(int i=0;i<ar.length;i++){
            int current=0;
            for(int j=i;j<ar.length;j++){
                current=current + ar[j] ;
                
                res = Math.max(res,current);
            }
        }
        return res;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in);
	    int n=sc.nextInt();
	    int[] ar=new int[n];
	    for(int i=0;i<n;i++){
	        ar[i]=sc.nextInt();
	    }
		System.out.println(find(ar));
	}
}
