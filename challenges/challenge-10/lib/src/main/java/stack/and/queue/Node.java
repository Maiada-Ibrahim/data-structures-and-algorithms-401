package stack.and.queue;

public class Node<T> {
//    public T value;
//    public Node <T> next;
    public Node next;
    public T value;

    public   Node( T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }


    public T getValue() {
        return value;
    }



//    public void setValue(T value) {
//        this.value = value;
//    }
}
