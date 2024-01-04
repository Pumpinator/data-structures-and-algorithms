package datastructures.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            next = null;
        }
    }

    public LinkedList() {
    }

    public LinkedList(T value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (head != null) {
            System.out.println(temp.value);
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
