import java.util.*;
public class Parantheses
{
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch == ')' || ch=='}' || ch==']'){
                if(st.isEmpty()) return false;
                
                char top = st.pop();
                
                if((ch==')' && top!='(') ||  (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')){
                        return false;
                    }
            }
        }
        return st.isEmpty();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	     System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
	    
	
	}
}
