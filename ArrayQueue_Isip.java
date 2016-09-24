/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [version number]
* @since   [9-26-2016]
*/

public class ArrayQueue_Isip {

    private String[] arrayQueue;
    private int arraySize, head=0, tail=0;

    public ArrayQueue_Isip(int size) {
        arraySize = size;
        arrayQueue = new String[arraySize];
    }

    public static void main(String[] args){
      ArrayQueue_Isip cons = new ArrayQueue_Isip(10);
      System.out.println("Queue Size: " + cons.arraySize);

      //show on empty queue
      cons.Show();
      
      cons.Enqueue("one");
      cons.Enqueue("two");
      cons.Enqueue("three");
      cons.Enqueue("four");
      cons.Enqueue("five");
      cons.Enqueue("six");
      cons.Enqueue("seven");
      cons.Enqueue("eight");
      cons.Enqueue("nine");
      cons.Enqueue("ten");
      
      cons.Show();
      
      //enqueue on full queue
      cons.Enqueue("eleven");
      
      //dequeue last element
      cons.Dequeue();
      
      //peel last element
      cons.Peek();
      
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();
      cons.Dequeue();

      cons.Show();
      
      //Dequeue on empty Queue
      cons.Dequeue();
}    

    public void Show(){
        System.out.println();        
        for(int i=0; i<arraySize; i++){
            System.out.println("Queue [" + i + "] = " + arrayQueue[i]);
        }
        System.out.println();
    }
    
    public boolean IsEmpty(){
        if((tail == -1) && (head == -1)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(arraySize-1 == tail){
            return true;
        } else {
            return false;
        }
    }
    
    public void Enqueue(String input){
        if(IsFull()){
            System.out.println("Queue is FULL. Failed enqueue..");
        } else if (IsEmpty()){
            head =0;
            tail=0;
            arrayQueue[tail] = input;
        } else {
            tail++;
            arrayQueue[tail] = input;
        }
    }
    
    public void Dequeue(){
        if(IsEmpty()){
            System.out.println("Queue is EMPTY. Failed dequeue..");
        } else if(head == tail){
            arrayQueue[head] = null;
            head= -1;
            tail = -1;
            System.out.println();
            System.out.println("Dequeue successful..");
        } else {
            arrayQueue[head] = null;
            head ++;
            System.out.println();
            System.out.println("Dequeue successful..");
        }
    }
    
    public void Peek(){
        System.out.println();
        System.out.println("Queue [" + tail + "] = " + arrayQueue[tail]);
    }
    
}
