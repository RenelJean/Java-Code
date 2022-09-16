public
class SingleLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;



    public SingleLinkedList() {
    }
    public void addFirst(E e){
      Node<E> newest = new Node<>(e,head);
      head = newest ;

      if( size == 0){
          tail = head;
      }
      size++;
    }//end of addFirst Method

    public void addLast(E e){
        //creates a node newest
        Node<E> newest = new Node<>(e, null);
        newest.next = null;
        //checks if empty
        if( size ==0){
            //set head equal to newest node
            head = newest;
       }//end of if
        else {
            tail.setNext(newest);
            tail = newest;
            size++;
        }//end o else

    }// End of removeFirst method


    public void removeFirst(){
        if(size != 0){
            //if list not empty sets head to head.getNext() and size= size - 1
            head = head.getNext();
            size--;
            //if size is empty set to null
            if (size==0){
                tail = null;
        }


        }

    }//end of remove first method


    } // end of class method
