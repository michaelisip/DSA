package BinarySearch;

import java.util.Scanner;
import java.util.Random;

public class BinarySearch {

	int []array;
	
	public void BinarySearch(int size){
		array = new int [size];
	}
	
	public void binarySearch(int search){
		int lowerBound=0,
			upperBound=array.length-1;
		while(lowerBound <= upperBound){
			int middleBound = (lowerBound+upperBound)/2;
			if(array[middleBound] == search){
				System.out.println(search + " found..");
				break;
			} else if(array[middleBound] < search)
				lowerBound = middleBound-1;
			else
				upperBound = middleBound-1;
		}
		System.out.println("not found...");
	}
	
	public void bubbleSort(){
		Random randNum = new Random();
		for(int i=0; i<array.length; i++){
			array[i] = randNum.nextInt(1000);
		}
		
		System.out.println();
		System.out.println("ARRAY VALUES:");
		for(int i=0; i<array.length; i++){
			if(i%10 == 0 && i != 0){
				System.out.println();
				System.out.print(array[i] + "\t");
			}
			else
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		int swap;
		for(int i=0; i<array.length-1; i++){
			for(int j=0; j<(array.length-i)-1; j++){
				if(array[j] > array[j+1]){
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		
		System.out.println();		
		System.out.println("SORTED VALUES:");		
		for(int i=0; i<array.length; i++){
			if(i%10 == 0 && i != 0){
				System.out.println();
				System.out.print(array[i] + "\t");
			}
			else
			System.out.print(array[i] + "\t");
		}
		System.out.println();		
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		BinarySearch obj = new BinarySearch();
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		obj.BinarySearch(size);

		obj.bubbleSort();
		
		System.out.println();		
		System.out.print("Enter value to be searched: ");
		int search = input.nextInt();		
		obj.binarySearch(search);
	}
}
