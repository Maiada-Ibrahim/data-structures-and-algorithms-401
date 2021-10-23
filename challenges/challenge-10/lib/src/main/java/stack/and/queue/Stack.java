package stack.and.queue;

public class Stack<T> {

    Node top;

    public Stack(Node top) {
        this.top = top;
    }
    public Stack() {}
    public void push(T value) {

        Node node = new Node(value);
        node.next = top;
        top = node;

    }




    public Object pop() {
        Node lastNode = top;
        try {
            if (lastNode.equals(null)) {
                return new NullPointerException();
            }
            top = top.next;
            lastNode.next = null;
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        return lastNode;
    }

    @Override
    public String toString() {
        Node current = top;
        String resulte = "";
        while (current != null) {
            resulte = resulte + "{" + current.value + "} -> ";
            current = current.next;
        }

        resulte = resulte + "Null";
        return resulte;
    }
    public Object peek() {
        Node lastNode = top;

        
            if (lastNode.equals(null)) {
                return new NullPointerException();
            } else {
                return top.value;
            }

    }
    public boolean isEmpty(){
        return top == null;
    }
}
