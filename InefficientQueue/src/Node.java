public class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> next)
    {
        this.element = e;
        this.next = next;
    }

    public Node<E> getNext() {return next;}

    public E getElement() { return element;}

    public void setNext(Node<E> next){
        this.next = next;
    }


}

