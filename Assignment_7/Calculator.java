class Calculator{
    int result; // instance variable
    static int operationCount=0; //static variable
    
    void add(int a,int b) //instance method
    {
        result=a+b;
        System.out.println("Addition " + result);
        operationCount++;
    }
    static void displayOperationCount(){ //Static method
        System.out.println("Operation count: "+ operationCount);
    }
    public static void main(String[] args){
      
        Calculator obj = new Calculator();
        obj.add(2,3); //call instance method using object
        
        displayOperationCount(); //call static method
    }
}