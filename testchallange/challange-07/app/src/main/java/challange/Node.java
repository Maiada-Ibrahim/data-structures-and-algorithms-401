package challange;

public class Node<T> {
    public Node next;
    public T value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(T value){
        this.value=value;
    }
}
