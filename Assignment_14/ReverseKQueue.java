import java.util.*;

public class ReverseKQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Enter number of elements in queue: ");
        int n = sc.nextInt();
      
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter queue elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        reverseFirstKElements(queue, k);
        

        System.out.println("Modified queue:");
        for (int num : queue) {
            System.out.print(num + " ");
        }
    }
    
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k > queue.size() || k <= 0) {
            return;
        }
        
        Stack<Integer> stack = new Stack<>();
        

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
       
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
       
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
    }
}
