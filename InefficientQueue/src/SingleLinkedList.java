public class SingleLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SingleLinkedList() {
    }
    public void addFirst(E e){
        Node<E> newest = new Node<>(e,head);
        head = newest;
        if (size == 0)
        {
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if (size == 0){
            head = newest;
        }
        else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public void removeFirst() {
        if (size != 0) {
            head = head.getNext();
            size--;
            if (size == 0)
                tail = null;
        }
    }
    public Node<E> first() {return head;}

    public int getLength() {
        return this.size;
    }
}