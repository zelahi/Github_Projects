package myLinkedList;

/**
 * Created by elahiz on 4/7/2015.
 */
public class DoublyEndedList {
    private Node head;
    private Node tail;

    //insert data at Tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);

        //check if there is only a head
        if (this.head == null){
            this.head = newNode;
        }

        //add item to the tail, and validate that we are at the tail
        if(this.tail != null){
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null){
            result += current.toString() + ", ";
            current = current.getNext();
        }
        result += "}";
        return result;
    }
}
