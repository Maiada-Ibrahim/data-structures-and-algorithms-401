/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challange;

public class App {


    public static void main(String[] args) {

    LinkedList<Integer> mylist = new LinkedList<>();
//        System.out.println(mylist.toString());
        mylist.Insert(1);
//        System.out.println(mylist.toString());
//        mylist.insert(5);
//        mylist.insert(6);
        mylist.Insert(10);
        mylist.Insert(3);
//        mylist.inserlast(66);
        mylist.Insert(8);
        mylist.Insert(9);
        mylist.Insert(6);
        mylist.Insert(66);

//        mylist.insertbefore(3,77);
//       mylist.insertafter(10,6);
        System.out.println(mylist.toString());
//       System.out.println(mylist.Include(10));
//        System.out.println(mylist.Include(3));
        System.out.println(mylist.kthfromend(66));





    }
}
