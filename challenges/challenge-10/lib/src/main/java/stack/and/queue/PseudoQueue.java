package stack.and.queue;

public class PseudoQueue<T> {
        Stack <T> stack1 = new Stack<>() ;
        Stack <T> stack2 = new Stack<>();
    public void enqueue( T value){
        stack1.push(value);
    }
    public void stack2Generator(){
        while ( ! stack1.isEmpty()){
            stack2.push((T) stack1.pop());
        }
    }
    public void stack1Generator(){
        while ( ! stack2.isEmpty()){
            stack1.push((T) stack2.pop());
        }
    }
    public T dequeue(){
        stack2Generator();
        T removedValue= (T) stack2.pop();
        stack1Generator();
        return removedValue;
    }
    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack1=" + stack1 +
                '}';
    }
}
