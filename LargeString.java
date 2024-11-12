public class LargeString {
public static void main (String [] args) {
	String [] arr  = {"app", "apple", "banana", "cat", "elephantaaa"};
	
	String largestString = findLargestString(arr);
	System.out.print("The largest string is " + largestString);
	
}

public static String findLargestString(String [] arr) {
	if(arr == null || arr.length == 0) {
		return null;
	}
	String largest = arr[0];
	
	for(int i = 1; i<arr.length; i++) {
		if(arr[i].length()>largest.length()) {
			largest = arr[i];
		}
	}
		return largest;
	
  }
}