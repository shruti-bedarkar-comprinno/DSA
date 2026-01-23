class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;
///add last node;
    void addList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //add node at starting
    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    } 
//print list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class TestLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addList(10);
        ll.addList(20);
        ll.addList(30);
        ll.addFirst(100);
        ll.printList();
    }
}

