import java.util.Scanner;

public class SI_CI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if (choice==1||choice==2) 
        {
            
             double P=sc.nextDouble();
            double R=sc.nextDouble();
            double T=sc.nextDouble();
            double res=0;
            
             if(choice==1) 
             {
            res =(P*R*T)/100;
        } 
        else if (choice==2) 
        {
            res=P*Math.pow((1+R/100),T)-P;
        } 
        else
        {
            System.out.println("Invalid choice.");
        }

        System.out.println(res);
	}
}
    
}
