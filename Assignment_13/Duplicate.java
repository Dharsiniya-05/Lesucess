import java.util.*;
public class Duplicate{
    
    static String removedup(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        for(char ch : st){
            res.append(ch);
        }
        
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removedup(input));
    }
}