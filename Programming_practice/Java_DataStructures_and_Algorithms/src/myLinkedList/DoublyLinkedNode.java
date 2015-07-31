package myLinkedList;

/**
 * Created by elahiz on 4/7/2015.
 */
public class DoublyLinkedNode {
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;
    int data;

    public DoublyLinkedNode(int data){
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public DoublyLinkedNode getPrev() {
        return prev;
    }

}
