Java code practice :



1 - Bubble sorting :


public class Bubblesort {
    public static void main (String [] args) {
        int arr[] = {1,2,9,3,7,2,5,9,80};
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for ( int j = 0; j < n-1; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }     
            }
        }

        for(int item : arr){
            System.out.print(item + ""); 

        }
        
    }
}

2- Selection sort:



