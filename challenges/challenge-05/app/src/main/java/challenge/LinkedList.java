package challenge;

public class LinkedList<T> {
    Node<T> head;


    public LinkedList() {
        this.head = null;
    }

    public void insert(T value) {
        Node firstnode = new Node(value);
        firstnode.next = head;
        head = firstnode;

    }

    public boolean include(T value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;

        }
        return  false;
    }

    @Override
    public String toString() {
        Node current = head;
        String resulte= "";
        while (current != null) {
           resulte=resulte+"{"+current.value+"} -> ";
            current = current.next;

        }
        resulte=resulte+"Null";
        return  resulte;
    }

}