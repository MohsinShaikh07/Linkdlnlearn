
public class Array {
//This file is changed but will be committed directly without staging
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define the array
	    int[] numbers = {1, 5, 8, 2, 9};
	    int left = 0;
	    int right = numbers.length - 1;

	    while (left < right) {
	      // Swap elements at left and right indices
	      int temp = numbers[left];
	      numbers[left] = numbers[right];
	      numbers[right] = temp;

	      // Move pointers towards the middle
	      left++;
	      right--;
	    }

	    // Print the reversed array
	    System.out.print("Reversed array: ");
	    for (int num : numbers) {
	      System.out.print(num + " ");
	    }
	    System.out.println();
	  }
	}
	    
	




