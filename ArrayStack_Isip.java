/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [version number]
* @since   [9-26-2016]
*/

public class ArrayStack_Isip {
    
  private String[] arrayStack;
  private int arraySize;
  private int top=0;
    
    
  public ArrayStack_Isip(int size) {
      arraySize = size;
      arrayStack = new String[arraySize];
  }
  public static void main(String[] args) {
      ArrayStack_Isip cons = new ArrayStack_Isip(10);
      
      System.out.println("STACK SIZE = " + cons.arraySize);
      System.out.println();

      //Show while stack is Empty
      cons.Show();
      
      //Push an element
      cons.Push("mj");
      
      //Peek top element
      cons.Peek();
      
      //Pop an element
      cons.Pop();
      
      cons.Show();
      
      //Peek on Empty stack
      cons.Peek();
      
      //Pop on Empty stack
      cons.Pop();
      
      cons.Push("one");
      cons.Push("two");
      cons.Push("three");
      cons.Push("four");
      cons.Push("five");
      cons.Push("six");
      cons.Push("seven");
      cons.Push("eight");
      cons.Push("nine");
      cons.Push("ten");
      
      //Push on Full stack
      cons.Push("eleven");
  }
  
  public void Show(){
      for(int i=arraySize-1; i>=0; i--){
          System.out.println("Stack [" + i + "] = " + arrayStack[i]);
      }
      System.out.println();      
  }
  
  public void Peek(){
      if(IsEmpty()){
          System.out.println("Stack is EMPTY!");
          System.out.println();
      } else {
          System.out.println("TOP: Stack [" + (top-1) + "] = " + arrayStack[top-1]);          
          System.out.println();
      }
  }
  
  public void Push(String input){
      if (IsFull()){
          System.out.println("Cannot PUSH anymore. Stack is FULL!");
          System.out.println();
      } else {
          arrayStack[top] = input;
          top++;
          System.out.println("Stack [" + (top-1) + "] = " + arrayStack[top-1]);
          System.out.println("--- Successful PUSH.");          
          System.out.println();
      }
  }
  
  public void Pop(){
      if(IsEmpty()){
          System.out.println("Cannot POP an element. Stack is EMPTY!");
          System.out.println();
      } else {
          System.out.println("Stack [" + (top-1) + "] = " + arrayStack[top-1]);
          arrayStack[top-1] = null;
          top--;
          System.out.println("--- Successful POP.");
          System.out.println();
      }
  }
  
  public boolean IsEmpty(){
      if (top == 0){
          return true;
      } else {
          return false;
      }
  }
  
  public boolean IsFull(){
      if(top == arraySize){
          return true;
      } else {
          return false;
      }
  }
}
