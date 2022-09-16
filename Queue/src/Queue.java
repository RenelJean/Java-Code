public interface Queue<E> {
    //Add an  element to queue
    public void enqueue(E e);

    //Remove element from the queue
    public E dequeue();


    //Return the current size of the queue
    public  int size();

    //return true id queue emoty, false otherwise
    public boolean isEmpty();

    //returns the first item of the queue without removing
    public E first();
}

