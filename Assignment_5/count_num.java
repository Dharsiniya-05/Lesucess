import java.util.Scanner;
public class count_num
{
static int find(int a){
    if(a==0){
        return 0;
    }
    return 1+find(a/10);
}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    
		System.out.println(find(a));
	}

}