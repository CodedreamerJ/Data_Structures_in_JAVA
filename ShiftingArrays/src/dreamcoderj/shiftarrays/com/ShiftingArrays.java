package dreamcoderj.shiftarrays.com;

import java.util.Arrays;

public class ShiftingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {5,10,15,20,25};
		int[] newArray = shiftArray(oldArray);
		
		System.out.println("This is the old Array: " + Arrays.toString(oldArray));
		System.out.println("This is the old Array: " + Arrays.toString(newArray));

	}
	
	public static int[] shiftArray(int[] array1) {
		int[] array2 = new int[array1.length];
		
		for(int i = 0; i < array1.length -1; i++) {
			//Copy the i'th element from array1 to the i+1 element to array2
			array2[i+1] = array1[i];
		}
		//Copy last element of array1 to the first element of array2
		array2[0] = array1[array1.length - 1];
		
		return array2;
		
	}

}
