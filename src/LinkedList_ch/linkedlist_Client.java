package LinkedList_ch;

public class linkedlist_Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(40);
        ll.addAtIndex(50,1);
        ll.display();
    }
}
