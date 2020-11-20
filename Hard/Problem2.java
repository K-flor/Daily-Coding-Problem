import java.util.Arrays;

public class Problem2{
	/*
		Problem # 2 [Hard]
		Given an array of integers, 
		return a new array such that each element at index 'i' of the new array is the product of all the numbers
		in the original array except the one at 'i'
		
		For example, if our input was [1,2,3,4,5],
		the expected output would be [120, 60, 40, 30, 24].

		Follow-up : what if you can't use division? 
	*/
	
	public static int product(int[] a, int i){
		int x = 1;
		for(int j=0; j < a.length; j++){
			if( j == i )
				continue;
			
			x = x * a[j];
		}

		return x;
	}

	public static double division(int[] a, int i){
		double x = -1;
		for(int j=0; j < a.length; j++){
			if( j == i )
				continue;
			
			if( x < 0 )
				x = a[j];
			else
				x = x / a[j];
		}

		return x;
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		// product
		int[] p_arr = new int[arr.length];
		for(int i=0; i < arr.length; i++)
			p_arr[i] = product(arr, i);
		
		System.out.println(Arrays.toString(p_arr));

		// division
		double[] d_arr = new double[arr.length];
		for(int i=0; i < arr.length; i++)
			d_arr[i] = division(arr, i);
	
		System.out.println(Arrays.toString(d_arr));
	}
}
