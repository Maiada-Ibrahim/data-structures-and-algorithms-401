package stack.and.queue;

public class Stack<T> {

    private Node top;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

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
            if  ( isEmpty()) {
                return "null";
            }else {
            top = top.next;
            lastNode.next = null;
                return lastNode;

            }
    }

//    @Override
//    public String toString() {
//        Node current = top;
//        String resulte = "";
//        while (current != null) {
//            resulte = resulte + "{" + current.value + "} -> ";
//            current = current.next;
//        }
//
//        resulte = resulte + "Null";
//        return resulte;
//    }


    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }

    public Object peek() {
        Node lastNode = top;

        
            if (isEmpty()) {
                return "null";
            } else {
                return top.value;
            }

    }
    public boolean isEmpty(){
        return top == null;
    }
}
