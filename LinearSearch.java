/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

/**
 *
 * @author MJ
 */

import java.util.Scanner;
import java.util.Random;


public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    
    int array[];
    
    public void LinearSearch(int size){
        array = new int[size];
    }
    
    public void Random(int size){
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
    
    public void Search(int search, int size){
        for(int i=0; i<array.length; i++){
            if(array[i] == search){
                System.out.println("Element found on index " + i);
                break;
            }
        }
        System.out.println("Element not found.");
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        LinearSearch obj = new LinearSearch();
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        System.out.print("Element to be searched: ");
        int search = input.nextInt();
        
        obj.LinearSearch(size);
        obj.Random(size);
        obj.Show();
        obj.Search(search, size);
    }

}
