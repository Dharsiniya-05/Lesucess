class Student {
    int roll_num;
    String name;
    Student(int roll,String n){    //parameterized constructor
       
        roll_num =  roll ;
         name = n ;
    }
    Student(int roll){
        roll_num = roll ;
        name = "Unknown";
    }
     void display(){
        System.out.println( roll_num + " "+ name);
    }
    
  
    public static void main(String[] args){
        Student obj = new Student(12, "Krish");
        obj.display();

         Student obj2 = new Student(15); //overloaded 
         obj2.display();
         
       
        
    }
}