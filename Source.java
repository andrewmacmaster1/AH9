import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
        ArrayList<Node<T>> nopeList = new ArrayList<>();
        while (head != null) {
            nopeList.add(head);
            head = head.next;
        }
        for (int i = nopeList.size() - 1; i >= 0; i--) {
            if (i == 0) {
                nopeList.get(i).next = null;
            } else {
                nopeList.get(i).next = nopeList.get(i-1);
            }
        }
        Node<T> newHead = nopeList.get(nopeList.size() - 1);
        return newHead;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
//        reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        head = Source.reverseList(a);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
  }