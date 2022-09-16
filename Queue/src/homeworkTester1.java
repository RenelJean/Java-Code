import java.util.Random;

public class homeworkTester1 {

    public static void main(String[] args){

        ArrayQueue<Integer> queue = new ArrayQueue<>();
        //Size of the array to use enqueue/dequeue
        int numbersize = 100;
        Random rand = new Random();
        int[] randomNumberArray = new int[numbersize];
        //Fill Array with random integers
        for(int i =0; i <numbersize; i++){
             randomNumberArray[i] = rand.nextInt();
        }

        int f = 0;
        //while f < numberSize , call randomly
        //enqeue w/ randomBumberArray[f]
     //   or deqeue, being verbose about Qhat is happening.

        while(f < numbersize){
            int n = rand.nextInt(2);
            if (n == 0){
                queue.enqueue(randomNumberArray[f]);
               System.out.println("Enqueued "+ randomNumberArray[f]);
               f++;
               queue.printQueue();
            }
            else
            {
                System.out.println("Dequeued objbect "+ queue.dequeue());
                queue.printQueue();
            }



        }

    }
}
