package zohoSets.set17;

import java.util.HashMap;

public class LRUCache {

    static class Node {
        int key;
        int value;
        Node pre;
        Node post;
    }

    private Node head, tail;

    private int count, capacity;

    private final HashMap<Integer, Node> hashTable = new HashMap<>();

    private void addNode(Node node) {
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }

    private void delete(Node node) {
        node.post.pre = node.pre;
        node.pre.post = node.post;
    }

    private void moveToHead(Node node) {
        delete(node);
        addNode(node);
    }

    private Node removeTail() {
        Node res = tail.pre;
        delete(res);
        return res;
    }

    public LRUCache(int initialCapacity) {
        this.capacity = initialCapacity;
        head = new Node();
        tail = new Node();
        tail.post = null;
        tail.pre = head;
        head.pre = null;
        head.post = tail;
        display();
    }

    public int getKey(int key) {
        Node node = hashTable.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = hashTable.get(key);
        if (node == null) {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            this.hashTable.put(key, newNode);
            this.addNode(newNode);
            ++count;

            if (count > capacity) {
                Node popNode = removeTail();
                this.hashTable.remove(popNode.key);
                --count;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
        display();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            if(hashTable.get(temp.key) != null)
                System.out.print(hashTable.get(temp.key).value + " ");
            temp = temp.post;
        }
        System.out.println();
    }
}

class Demo{

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        lruCache.put(4, 40);
        lruCache.getKey(2);
        lruCache.display();
    }
}


