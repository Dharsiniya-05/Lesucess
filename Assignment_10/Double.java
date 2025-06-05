import java.util.Scanner;

class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

  
    public void createList(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            insertAtEnd(value);
        }
    }

  
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

  
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtThirdPosition(int data) {
        if (head == null || head.next == null) {
            System.out.println("Not enough elements to insert at 3rd position.");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < 2; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteFirst() {
        if (head == null)
            return;

        head = head.next;
        if (head != null)
            head.prev = null;
    }


    public void deleteLast() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }


    public void deleteAtThirdPosition() {
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("Not enough nodes to delete at position 3.");
            return;
        }

        Node temp = head;
        for (int i = 1; i < 2; i++) {
            temp = temp.next;
        }

        Node nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;

        if (nodeToDelete.next != null)
            nodeToDelete.next.prev = temp;
    }


    public void displayForward() {
        Node temp = head;
        System.out.print("List (forward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Double {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
     
        dll.createList(n, sc);
        dll.displayForward();

        dll.insertAtBeginning(sc.nextInt());
        dll.displayForward();

        dll.insertAtEnd(sc.nextInt());
        dll.displayForward();

      
        dll.insertAtThirdPosition(sc.nextInt());
        dll.displayForward();


        dll.deleteFirst();
        dll.displayForward();

     
        dll.deleteLast();
        dll.displayForward();

        dll.deleteAtThirdPosition();
        dll.displayForward();

    }
}
