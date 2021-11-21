package challange;

public class LinkedList<T> {
    Node<T> head;
    public LinkedList() {
        this.head = null;
    }

    public void Insert(T value) {
        Node firstNode = new Node(value);
        firstNode.next = head;
        head = firstNode;

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
    public void insertAfter(T theNodeAddAfter,T value) {
        Node current = head;
        while (current.next != null) {
          if (current.value.equals(theNodeAddAfter)){
              Node newNode = new Node(value);
              newNode.next=current.next;
              current.next=newNode;
              break;
          }
            current = current.next;
        }
    }
    public void inserLast(T value) {
        if (head==null){
            Insert(value);
        }else {
        Node current = head;
        Node newNode = new Node(value);
        while (current.next != null) {
                current=current.next;
            }
            current.next = newNode;}
        }
    public void insertBefore(T theNodeAddBefore,T value) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value.equals(theNodeAddBefore)){
                Node newNode = new Node(value);
                newNode.next=current.next;
                current.next=newNode;
                break;
            }
            else {
                if (current.value.equals(theNodeAddBefore)){
                Insert(value);}

            }
            current = current.next;


        }


        }

    }


