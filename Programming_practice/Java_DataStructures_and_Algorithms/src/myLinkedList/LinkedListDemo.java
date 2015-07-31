package myLinkedList;

import sun.awt.image.ImageWatched;

/**
 * Created by elahiz on 4/7/2015.
 */
public class LinkedListDemo {

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        //Add items to a LinkedList
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        //print out the list to ensure the values are inserted correctly
        System.out.println(list);

        //Print out the length of the Linked List
        System.out.println("Length of the List:" + list.getLength());

        //Delete a value from the list and verify that it was removed
        list.deleteAtHead();
        System.out.println("After deleting head node: ");
        System.out.println(list);

        //Test Find function
       System.out.print("The number found is: " +  list.find(12));
       System.out.print("The number found is: " +  list.find(17));

        //Reverse the LinkedList
        LinkedList reversedList = list.reverseList(list);
        System.out.println("The Reversed List is: " + reversedList.toString());



    }
}
