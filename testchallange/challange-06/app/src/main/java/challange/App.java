/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challange;

public class App {


    public static void main(String[] args) {

    LinkedList<Integer> mylist = new LinkedList<>();
//        System.out.println(mylist.toString());
        mylist.Insert(1);
//        mylist.insert(5);
//        mylist.insert(6);
        mylist.Insert(10);
        mylist.Insert(3);
//        System.out.println(mylist.toString());

        mylist.inserlast(66);
//        mylist.Insert(8);
//        mylist.Insert(9);
        mylist.insertbefore(10,77);
       mylist.insertafter(1,6);
        System.out.println(mylist.toString());
        mylist.delete(10);
        System.out.println(mylist.toString());

//       System.out.println(mylist.Include(10));
//        System.out.println(mylist.Include(3));




    }
}
