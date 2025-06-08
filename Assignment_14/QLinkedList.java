class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class QLinkedList {
    Node front = null, rear = null;

  
    void enqueue(int val) {
        Node newNode = new Node(val);

        if (rear == null) { 
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(val );
    }

 
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(front.data );
        front = front.next;

        if (front == null) { 
            rear = null;
        }
    }


    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QLinkedList q = new QLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue(); 
    }
}
