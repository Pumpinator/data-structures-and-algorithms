package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.insert(3, 5);
        linkedList.insert(0, 0);
        linkedList.insert(4, 4);

        linkedList.printList();
    }
}