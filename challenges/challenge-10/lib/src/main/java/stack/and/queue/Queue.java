package stack.and.queue;

public class Queue<T> {

    Node front ;
    Node rear;
    public Queue(){

    }

    public Queue(T value){
        this.front=new Node(value);
        this.rear= this.front;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enQueue(T value){

            if (rear == null){
                front= new Node(value);
                rear = front;
            }else{
                this.rear.next = new Node(value);
                this.rear=this.rear.next;
            }

    }
    public Object deQueue(){
        Node deleteNode = front;

            if (isEmpty()){
                return "null";
            }else {
                this.front=front.next;
                deleteNode.next=null;
                return deleteNode;
            }
    }

    public Object peek (){
            if (isEmpty()){
                return "null";
            }else{
                return front.value;
            }

        }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}

