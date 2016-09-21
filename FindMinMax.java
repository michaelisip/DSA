package FindMinMax;

public class FindMinMax {

	int array [] = {23, 45, 75, 48, 83, 97, 82, 26, 94, 79};
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	public void findMin(){
		for(int i=0; i<array.length; i++){
			if(array[i] < min)
				min = array[i];
		}		
		System.out.println("Min: " + min);
	}
	
	public void findMax(){
		for(int i=0; i<array.length; i++){
			if(array[i] > max)
				max = array[i];			
		}
		System.out.println("Max: " + max);
	}
	
	public void show(){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		FindMinMax obj = new FindMinMax();
		
		System.out.println("ARRAY VALUES:");
		obj.show();
		
		obj.findMax();
		obj.findMin();
	}
}
