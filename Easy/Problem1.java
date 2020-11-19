/*
  Problem # 1 [Easy]
  Given a list of numbers and a number 'k' , return whether any two numbers from the list add up to 'k'.
  
  For example, given [10, 15, 3, 7] and 'k' of 17 , return true since '10 + 7' is '17'
*/

public class Problem1{
	public static boolean addUp(int[] arr, int k){
		for(int i=0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if (arr[i] + arr[j] == k){
					System.out.println(arr[i] + " + " +arr[j] +" = "+k);
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args){
		int[] arr = {10, 15, 3, 7, 2, 5, 11};
		int k = 9;

		System.out.println( addUp(arr, k) );
	}
}
