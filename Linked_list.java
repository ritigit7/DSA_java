class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_list {
    Node head=null;
    public static void main(String[] args) {
        Linked_list obList = new Linked_list();
        obList.add(5);
        obList.add(7);
        obList.add(4);
        obList.display();
    }

    public void add(int dt) {
        Node newNode = new Node(dt);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
