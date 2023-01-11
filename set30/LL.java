package zohoSets.set30;

public class LL {

    Node head, tail;
    int size = 0;

    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int idx) {
        if (idx == 0) {
            insertFirst(val);
            return;
        }
        if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) temp = temp.next;

        temp.next = new Node(val, temp.next);
        size++;
    }

    public int deleteLast() {
        if (size <= 1) deleteFirst();
        Node secondLast = get(size - 2);
        int value = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int idx) {
        if (idx == 0) return deleteFirst();
        if (idx == size - 1) return deleteLast();
        Node temp = get(idx - 1);
        int value = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return value;
    }
    private Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) node = node.next;
        return node;
    }

    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void removeDuplicates() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
                size--;
            } else temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    private int deleteFirst() {
        if (head == null) return -1;
        int value = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return value;
    }

    public void reverse() {
        Node current = head;
        Node next = current.next;
        Node prev = null;
        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }
        head = prev;
    }

    public int middleNode() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == null) return -1;
        return slow.data;
    }

    public void recursionReverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        recursionReverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void sortedInsert(int data) {
        Node temp = head;
        Node newN = new Node(data);
        if (temp == null || temp.data > data) {
            newN.next = head;
            head = newN;
            return;
        }
        Node prev = head;
        while (temp != null) {
            if (temp.data > data) {
                newN.next = prev.next;
                prev.next = newN;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) prev.next = newN;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertLast(30);
        ll.insertLast(40);
        ll.insertLast(50);
        ll.insertLast(60);
        ll.insertLast(70);
        ll.insertLast(80);
        ll.insertLast(90);
//        ll.removeDuplicates();
//        ll.reverse();
//        ll.recursionReverse(ll.head);
//        ll.deleteFirst();
//        System.out.println(ll.middleNode());
//        ll.sortedInsert(25);
        ll.display();
    }
}
