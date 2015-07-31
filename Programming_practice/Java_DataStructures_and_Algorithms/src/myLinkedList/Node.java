package myLinkedList;

/**
 * Created by elahiz on 4/7/2015.
 */
public class Node {
    private int data;
    private Node next;

    public Node (int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setData(int data){
        this.data=data;
    }

    public void setNextNode(Node nextNode){
        this.next = nextNode;
    }

    @Override
    public String toString() {
        return "data: " + this.data;
    }

}
