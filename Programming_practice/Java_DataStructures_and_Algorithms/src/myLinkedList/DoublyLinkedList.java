package myLinkedList;

/**
 * Created by elahiz on 4/7/2015.
 */
public class DoublyLinkedList {
    private DoublyLinkedNode head;
    static int length = 0;

    public void insertAtHead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNext(this.head);
        if (this.head != null){
            this.head.setPrev(newNode);
        }
        this.head = newNode;
        newNode.setPrev(null);
        length++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode n = this.head;

        while(n != null){
            sb.append("Node data: ");
            sb.append(n.data);
            sb.append("\n");

            n = n.getNext();
        }
        return sb.toString();
    }

}
