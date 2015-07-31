package myLinkedList;

import sun.awt.image.ImageWatched;

/**
 * Created by elahiz on 4/7/2015.
 */
public class LinkedList {
    private Node head;
    public static int length = 0;

    //add node to the LinkedList
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
        length++;
    }

    //delete node at the head
    public void deleteAtHead(){

        this.head = this.head.getNext();
    }

    //search through the data
    public Node find(int data){
        Node temp = this.head;
        while(temp != null){
            if(temp.getData() == data) {
                return temp;
            }
        }
        return null;
    }

    //iteratively reverse the LinkedList
    public LinkedList reverseList(LinkedList list){
        //create three nodes to track position
        Node prev = null;
        Node current = this.head;
        Node next = current;

        //Loop and reverse until we reach the end of the list
        while(current != null){
            next.setNextNode(current.getNext());
            current.setNextNode(prev);
            prev.setNextNode(current);
            next.setNextNode(current.getNext());
        }

        //set the head to the beginning of the reversed LinkedList
        head = prev;

        //return the reversed list
        return list;
    }

    @Override
    public String toString(){
        String result = "{";

        Node current = this.head;

        while(current != null){
            result += current.toString() + " ";
            current = current.getNext();
        }
        return result + "}";
    }

    public static int getLength(){
        return length;
    }


}
