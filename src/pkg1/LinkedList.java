package pkg1;

public class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next  != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        Node current = head;

        while(current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }

    public void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        int i = 0;
        while(i < index - 1) {
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtIndex(int index) {
        Node current = head;
        int position = 0;

        while (position < index - 2) {
            current = current.next;
            position++;
        }
        current.next = current.next.next;
    }


    public int getIndex(int ans) {
        int length = -1;
        Node current = head;

        while (current != null) {
            if (current.data == ans) {
                return length;
            }
            current = current.next;
            length++;
        }
        return -1;
    }

    public int get(int index) {
        Node current = head;
        int position = 0;

        while(position < index - 1) {
            current = current.next;
            position++;
        }
        return current.data;
    }


    @Override
    public String toString() {
        String result = "{";
        Node current = head;
        while(current != null) {
            result += current.toString() + ",";
            current = current.next;
        }
        result += "}";
        return result;
    }
}
