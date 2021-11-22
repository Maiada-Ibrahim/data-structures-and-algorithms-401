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
    };

    return (T) indexValue.value;
}


    public Object findNth( int k) {
        Node p = head;
        Node f = head;
        int count = 1;
        if (k < 0) {
            System.out.println("You Can't Add K in Negative Value");
            return -1;
        }
        while (count <= k - 1) {
            f = f.next;
            count = count + 1;

        }
        while (f.next != null) {
            f = f.next;
            p = p.next;
        }
        return p.value;
    }












    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    public int size(){
        Node current = this.head;
        int nodesNumber=1;
        while(current.getNext() != null){
            nodesNumber +=1;
            current = current.getNext();

        }
        return nodesNumber;

    }
    public static Object zipLists(LinkedList list1, LinkedList list2){
        LinkedList listZip = new LinkedList();
        if (list1.size() != list2.size()){
            return "to use this method the the two list should have the same length";
        }
        Node current1= list1.head;
        Node current2= list2.head;

        while (current1 != null){
            listZip.Insert(current1.value);
            listZip.Insert(current2.value);
            current1=current1.getNext();
            current2=current2.getNext();
        }
//        System.out.println(listZip.toString());
        return listZip;
    }
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







    public void  palindrome (){
        Node current = head;
        Node current2 = head;
        LinkedList<T> list = new LinkedList<>();
        int mid ;
        if(current == null || current.next == null){
            System.out.println("no Palindrom");
            return;
        }
        int size=1;
        while(current.getNext() != null){
            size +=1;
            current = current.getNext();

        }
        System.out.println(size);
        if(size % 2 ==0){
            mid = size/2;

        }else
            mid = (size+1)/2;
        System.out.println(mid);
        for(int i = 0;i<mid;i++){
            current2 = current2.next;
        }
        while(current2!= null){
            T value = (T)current2.value;
            list.Insert(value);
            current2 = current2.next;

        }
        current2 = list.head;
        current=head;
        System.out.println(list.toString());
        while(current != null && current2.next!=null){

            if(current.value != current2.value){
                System.out.println("no Palindrom");
                return;}
            current =current.next;
            current2 = current2.next;
        }
        System.out.println("There is Palindrom");

    }























    }
