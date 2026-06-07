package org.example.LLClass;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value) {
        Node node = new Node(value);
        if (head != null) {
            head.prev = node;
            node.next = head;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = get(index);
        Node node = new Node(value);

        node.prev = temp.prev;
        node.next = temp;

        temp.prev.next = node;
        temp.prev = node;

        size++;
    }

    int deleteFirst() {
        if (size == 0) {
            return -1;
        }
        int val = head.value;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;
        return val;
    }

    int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }

    int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = get(index);
        int val = temp.value;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
        return val;
    }

    Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.display();

        dll.addLast(6);
        dll.addLast(7);
        dll.display();

        dll.insert(2, 33);
        dll.display();

        System.out.println(dll.deleteFirst());
        dll.display();

        dll.deleteLast();
        dll.display();

        dll.delete(2);
        dll.display();

        dll.displayReverse();
    }
}