package test;

public class Methods {

	public static void main(String[] args) {
		
		int[] productPrices = {1200, 2300, 3300, 1600, 1900};
		int[] footballScores = {10, 20, 30, 40, 50};
		int[] cricketScores = {100, 200, 300, 400, 500};
		
				
		System.out.println("Maximum Product Price: " + getMax(productPrices));
		System.out.println("Maximum Football Score: " + getMax(footballScores));
		System.out.println("Maximum Cricket Score: " + getMax(cricketScores));
	}
	
	static int getMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
