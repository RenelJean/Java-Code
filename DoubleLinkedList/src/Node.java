public class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;

    public Node(E e,Node<E> prev, Node<E> next)
    {
        this.element = e;
        this.next = next;
        this.prev = prev;
    }


    public E getElement() { return element;}

    public void setNext(Node<E> next) {
        this.next = next;
    }
    public Node<E> getNext() {return next;}


    public void setPrev(Node<E> prev){
        this.prev = prev;
    }
    public Node<E> getPrev(){return prev;}

}

