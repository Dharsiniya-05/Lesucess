import java.util.Scanner;
public class Prime_No
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for(int i=2;i<=n;i++)
	    {
             int count=0;
            for (int j=2;j<=i/2;j++) {
                if (i%j==0) {
                    count++;
                    break;
                }
            }

            if(count==0) {
                System.out.print(i + " ");
            }
        }

	}
}
