/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [version number]
* @since   [9-26-2016]
*/

package SumAveMax;

/**
 *
 * @author MJ
 */

import java.util.Scanner;
import java.util.Random;

public class SumAveMax {

    /**
     * @param args the command line arguments
     */
    
    int array[];            
    int sum = 0;
    int max = 0;
    
    public void SumAveMax(int size){
        array = new int[size];
    }
    
    public void Random(){
        Random randNum = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = randNum.nextInt(500);
        }
    }
    
    public void Show(){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    
    public int GetSum(){
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
        
        return sum;
    }

    public void GetAve(){
        double ave = sum/array.length;
        System.out.println("Ave: " + ave);
    }    

    public void GetMax(){
        for(int i=0; i<array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Max: " + max);
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        SumAveMax obj = new SumAveMax();
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        obj.SumAveMax(size);
        obj.Random();
        obj.Show();
        obj.GetSum();
        obj.GetAve();
        obj.GetMax();
    }
    
}
