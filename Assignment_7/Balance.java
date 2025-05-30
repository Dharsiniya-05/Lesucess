class BankAccount{
    private double balance=15000.25;
    void deposit(double depo){
        balance = balance + depo;
        // System.out.println(balance);
    }
      void getBalance(){
        System.out.println(balance);
    }
}

class Balance{
    public static void main(String[] args){
       
        BankAccount Acc=new BankAccount();
        System.out.print("Before depositing  : " );
        Acc.getBalance();
        Acc.deposit(5000.00);
        
        //  System.out.print("After depositing  : "  + Acc.balance);
        //  error: balance has private access in BankAccount
        
        
         Acc.getBalance();  // by object accessing the balance
        
        
    }
}
