package pkg1;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
