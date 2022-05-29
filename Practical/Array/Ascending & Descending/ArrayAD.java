package corejava1;
import java.util.Arrays;
import java.util.Collections;
public class ArrayAD {
	 public static void main(String[] args)
	    {
	        // Custom input string
	        String arr[] = { "Shubham",
	                        "Sandesh",
	                        "Sumeet","Sanket" };

	        // Sorts arr[] in ascending order
	        Arrays.sort(arr);
	        System.out.println("In Ascending Order Modified arr[] : \n"+Arrays.toString(arr));

	        // Sorts arr[] in descending order
	        Arrays.sort(arr, Collections.reverseOrder());

	 

	        // Lastly printing the above array
	        System.out.println("\n In descending Order Modified arr[] : \n"+Arrays.toString(arr));
	    }
	}



