import java.util.Scanner;

public class SS {
    
    // Linear Search
    static int lsearch(int arr[], int key) {                              // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    // Binary Search
    static int bsearch(int arr[], int key, int low, int high) {               //O(log n)
        int mid = low + (high - low) / 2; // Correct mid calculation
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return bsearch(arr, key, low, mid - 1); 
        } else if (arr[mid] < key) {
            return bsearch(arr, key, mid + 1, high); 
        }
		else{
			return -1;
		}
    }
    
    // Bubble Sort
    static void bsort(int arr[]) {                                              //O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {22, 33, 12, 34, 67, 23, 89, 34, 90};
        int key = 23;

        // Linear search
        int result = lsearch(arr, key);
        System.out.println("Linear Search Result: " + result);

        // Sorting the array
        bsort(arr);
        System.out.println("Sorted Array: ");
        display(arr);

        // Binary search
        int binaryResult = bsearch(arr, key, 0, arr.length - 1);
        System.out.println("Binary Search Result: " + binaryResult);
    }
}
