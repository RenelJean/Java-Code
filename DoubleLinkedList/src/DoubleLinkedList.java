public class DoubleLinkedList<E>  {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public DoubleLinkedList(){
        head = new Node(null,null,null);
        tail = new Node(null,null,null);

    }

    public void addFirst(E e){
        addBetween(e,head,head.getNext());
    }

    public void addLast(E e){
        addBetween(e,tail.getPrev(),tail);
    }

    public void addBetween(E e, Node<E> predecessor,Node<E> successor){
        //  newest.element = e;
        // newest.prev = predecessor;
        //newest.next = successor;
        //successor.prev =newest; next line does all four
        Node<E> newest = new Node<>(e,predecessor,successor);
        newest.setPrev(newest);
        size++;

    }
    public void remove(Node<E> node){
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
    }


}
