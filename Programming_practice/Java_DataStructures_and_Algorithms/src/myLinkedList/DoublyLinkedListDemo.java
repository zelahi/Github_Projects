package myLinkedList;

/**
 * Created by elahiz on 4/7/2015.
 */
public class DoublyLinkedListDemo {
    public static void main(String[] args){
        DoublyLinkedList integers = new DoublyLinkedList();

        integers.insertAtHead(5);
        integers.insertAtHead(10);
        integers.insertAtHead(2);
        integers.insertAtHead(12);
        integers.insertAtHead(19);

        System.out.println(integers);

    }
}
