package challange;




public class LinkedList<T> {
    Node<T> head;
    int length=9;
    public LinkedList() {
        this.head = null;
    }

    public void Insert(T value) {


        Node firstnode = new Node(value);
        firstnode.next = head;
        head = firstnode;

    }

    public boolean Include(T value) {
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
    public void insertafter(T thenodeaddafter,T value) {
        Node current = head;
        while (current.next != null) {
          if (current.value.equals(thenodeaddafter)){
              Node newnode = new Node(value);
              newnode.next=current.next;
              current.next=newnode;
              break;
          }
            current = current.next;
        }
    }
    public void inserlast(T value) {
        Node current = head;
        Node newnode = new Node(value);
        while (current.next != null) {
                current=current.next;
            }
            current.next = newnode;
        }
    public void insertbefore(T thenodeaddbefore,T value) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value.equals(thenodeaddbefore)){
                Node newnode = new Node(value);
                newnode.next=current.next;
                current.next=newnode;
                break;
            }
            current = current.next;


        }

    }
//    public int kthfromend(T value) {
//        Node current = head;
//        int indexof =0;
//        int index=-1;
//
//        while (current != null) {
//                if (current.value.equals(value)){
//                    indexof=index+1;
//
//            }
//            index=index+1;
//            current = current.next;
//        }
////        System.out.println(index);
////        System.out.println(indexof);
//
//        return (index-indexof);
//    }
public T kthfromend( int indexof) {
    Node current = head;
    Node indexValue=head;
    int value1 =0;
    int index =-1;

    while (current != null) {
     index=index+1;

        if (index== indexof){
            indexValue= current;

            break;
        }
        current = current.next;
    }
//        System.out.println(index);
//        System.out.println(indexof);

    return (T) indexValue.value;
}
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


//    public  static LinkedList ZipList(LinkedList list1, LinkedList list2){
// LinkedList ziplinked= new LinkedList();
// int biggerlist=list1.getLength()>=list2.getLength()?list1.getLength():list2.getLength();
// System.out.println(list1.getLength());
// for (int i=1;i<=biggerlist;i++){
//     if(list1.getLength()-1>=0){
//         ziplinked.Insert(list1.kthfromend(list1.getLength()-i));
//     }
//if(list2.getLength()-1>=0){
//    ziplinked.Insert(list2.kthfromend(list2.getLength()-i));
//}
// }
//
//return  ziplinked;
//
//}
public String reserve() {
    Node reversedPart = null;
    Node current = head;
    while (current != null) {
        Node next = current.next;
        current.next = reversedPart;
        reversedPart = current;
        current = next;
    }
    head = reversedPart;
     current = head;
    String resulte= "";
    while (current != null) {
        resulte=resulte+"{"+current.value+"} -> ";
        current = current.next;

    }
    resulte=resulte+"Null";
    return  resulte;
}
    }
