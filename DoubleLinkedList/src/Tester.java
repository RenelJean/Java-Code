public class Tester {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        String hello = "hello";
        list.addFirst(hello);
        list.addFirst("goodbye");
        list.addFirst("firstelement");

     //   list.printList();
      //  Node<String> node = list.first();
      //  System.out.println(node.getElement());


    }
}
