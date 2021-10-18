package challange;

public class LinkedList<T> {
    Node<T> head;
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

    }
