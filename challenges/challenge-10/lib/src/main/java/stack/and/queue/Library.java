/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import java.io.IOException;

public class Library {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(70);

//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop().toString());
//        System.out.println(stack);
//        System.out.println(stack.pop().toString());
//        System.out.println(stack);
//         System.out.println(stack.peek());
//                System.out.println(stack.peek().toString());
//
//        Queue queue=new Queue();
//queue.enQueue(5);
//queue.enQueue(4);
//queue.enQueue(70);
//queue.deQueue();
//        queue.deQueue();

//System.out.println(queue.deQueue().toString());

//        PseudoQueue<Integer> ps = new PseudoQueue<>();
//                 ps.enqueue(5);
//                 ps.enqueue(10);
//                 ps.enqueue(15);
//                 System.out.println(ps.toString());
//                 System.out.println(ps.dequeue());
//
//
//        System.out.println(ps.toString());


//------------------------------------------cc12
//        Cat cat1= new Cat("cat1");
//        Cat cat2= new Cat("cat2");
//        Dog dog1= new Dog("dog1");
////        Dog dog2= new Dog("dog2");
//        AnimalShelter shelter= new AnimalShelter();
//        shelter.enqueue(cat1);
//        shelter.enqueue(cat2);
//        shelter.enqueue(dog1);
////        shelter.enqueue(dog2);
//        System.out.println(shelter.toString());
//        System.out.println(shelter.dequeue("cat"));
//        System.out.println(shelter.dequeue("dog"));
//        System.out.println(shelter.dequeue("dog"));
//
//        System.out.println(shelter.toString());
//---------------------------------------------cc13
          CheckerBracket cheker = new CheckerBracket();
      System.out.println(cheker.validateBrackets("{}"));
      System.out.println(cheker.validateBrackets("{}(){}"));
      System.out.println(cheker.validateBrackets("()[[Extra Characters]]"));
      System.out.println(cheker.validateBrackets("(){}[[]]"));
      System.out.println(cheker.validateBrackets("(){}[[]]"));
      System.out.println(cheker.validateBrackets("{}{Code}[Fellows](())"));
      System.out.println(cheker.validateBrackets("[({}]"));
      System.out.println(cheker.validateBrackets("(]("));
      System.out.println(cheker.validateBrackets("{(})"));



    }



}
