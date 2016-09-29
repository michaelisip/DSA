/**
* A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
* 
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [1.1]
* @since   [9-26-2016]
*/

public class ArrayStack {
    
  private String[] arrayStack;
  private int arraySize;
  private int top=0;
    
    
  public ArrayStack(int size) {
      arraySize = size;
      arrayStack = new String[arraySize];
  }
  public static void main(String[] args) {
      ArrayStack obj = new ArrayStack(10);
      
      System.out.println("STACK SIZE = " + obj.arraySize);
      System.out.println();

      //Show while stack is Empty
      obj.Show();
      
      //Push an element
      obj.Push("mj");
      
      //Peek top element
      obj.Peek();
      
      //Pop an element
      obj.Pop();
      
      obj.Show();
      
      //Peek on Empty stack
      obj.Peek();
      
      //Pop on Empty stack
      obj.Pop();
      
      obj.Push("one");
      obj.Push("two");
      obj.Push("three");
      obj.Push("four");
      obj.Push("five");
      obj.Push("six");
      obj.Push("seven");
      obj.Push("eight");
      obj.Push("nine");
      obj.Push("ten");
      
      //Push on Full stack
      obj.Push("eleven");
      
      obj.Show();
  }
  
  public void Show(){
      for(int i=arraySize-1; i>=0; i--){
          System.out.println("Stack [" + i + "] = " + arrayStack[i]);
      }
      System.out.println();      
  }
  
  public void Peek(){
      if(IsEmpty()){
          System.out.println("Peek is null. Stack is EMPTY!");
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
