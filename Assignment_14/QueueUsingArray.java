public class QueueUsingArray {
    int[] queue = new int[100];  
    int front = -1, rear = -1;

  
    void enqueue(int val) {
        if (rear == 99) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) front = 0;

        queue[++rear] = val;
        System.out.println(val);
    }


    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(queue[front]);
        front++;
    }


    void display() {
        if (front == -1 || front > rear) {
            System.out.println(" empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();  // Queue is empty
    }
}
