package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.set(0, 0);

        linkedList.printList();
    }
}