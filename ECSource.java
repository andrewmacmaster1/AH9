
class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
      var val = head.val; // save initial value
      while (head != null) {
          if (head.val != val) { // fail if value ever doesn't match initial value
              return false;
          }
          head = head.next;
      }
      return true; // complete traversal
  }

  public static <T> boolean isUnivalueListRecursive(Node<T> head) {
      if (head.next == null) { // escape clause; we get here the list is univalue
          return true;
      } else if (head.val != head.next.val) { // escape clause; this means at least two values don't match
          return false;
      }
      return isUnivalueListRecursive(head.next); // recursion step
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));

      Node<Integer> u = new Node<>(2);
      Node<Integer> v = new Node<>(2);
      Node<Integer> w = new Node<>(3);
      Node<Integer> x = new Node<>(3);
      Node<Integer> y = new Node<>(2);

      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;

      System.out.println(ECSource.isUnivalueList(u));
      System.out.println(ECSource.isUnivalueListRecursive(u));
    }
}
