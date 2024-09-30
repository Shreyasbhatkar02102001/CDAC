
class Heapsort {

	void heapify(int arr[], int n, int i){
	
		int largest = i;    // Root
		int l = 2 * i + 1;   // LC
		int r = 2 * i + 2;   // RC
		
		/// if left node is greater than root node than largest =  left
		if(l < n && arr[l] >  arr[largest])
			largest = l;
		
		/// if Right node is greater than root node than largest =  Right
		if(r < n && arr[r] >  arr[largest])
			largest = r;
		
		if (largest != i){
			
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
		
		//heapify(arr, n, largest);
		
	}
	
	
	void heapsort(int arr[]){
		
		int n = arr.length;
		
		//Building Max Heapify
		for (int i = n/2-1; i > 0; i--){
			heapify(arr, n, i);                  /// to make max heap
		}
		
		// one by one extract elements from the heap
		for (int i = n-1; i > 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
		
		//heapify(arr, i, 0);
	}	
	
	void display(int arr[]){
		
		int n  = arr.length;
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
	
	
	public static void main(String args[]){
		
		Heapsort h1 = new Heapsort();
		
		int arr[] = {99,66,77,44,33,88,11};
		
		h1.display(arr);
		
		h1.heapsort(arr);
		h1.display(arr);
		
		
		
	}


}



/*

Sure! Let’s walk through the Heapsort algorithm step by step with a focus on how the recursion happens, and we’ll add some comments to clarify what’s happening at each stage. I'll annotate the code to include calculations and explain what each recursion does.

### Heapsort Code with Annotations

```java
class Heapsort {

    // This method helps to organize the array into a max heap
    void heapify(int arr[], int n, int i) {
        int largest = i;    // Start by assuming the root is the largest
        int l = 2 * i + 1;  // Left child index
        int r = 2 * i + 2;  // Right child index

        // Check if the left child exists and is greater than the root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;  // Update largest if left child is bigger
        }

        // Check if the right child exists and is greater than the current largest
        if (r < n && arr[r] > arr[largest]) {
            largest = r;  // Update largest if right child is bigger
        }

        // If the largest is not the root, swap them
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main method to sort the array using heapsort
    void heapsort(int arr[]) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);  // Create a max heap from the array
        }

        // Step 2: One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // This method displays the array
    void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // The main method where we run our program
    public static void main(String args[]) {
        Heapsort h1 = new Heapsort();

        // Initial array
        int arr[] = {99, 66, 77, 44, 33, 88, 11};

        System.out.println("Original array:");
        h1.display(arr);  // Display original array

        h1.heapsort(arr); // Sort the array
        System.out.println("Sorted array:");
        h1.display(arr);  // Display sorted array
    }
}
```

### Explanation of Recursion and Steps

#### Building the Max Heap

1. **Heapify Process**:
   - Start from the last parent node (for a 7-element array, it's at index `2`).
   - Call `heapify` for each parent node moving upwards.
   - Each `heapify` call checks and swaps elements to maintain the max-heap property.

For example, starting with the initial array `{99, 66, 77, 44, 33, 88, 11}`:

- **First call** to `heapify(arr, 7, 2)`:
  - Left child (index 5: 88) is greater than root (index 2: 77).
  - Swap: `{99, 66, 88, 44, 33, 77, 11}`
  - Call `heapify(arr, 7, 5)`: No swaps needed since both children don't exist.

- **Second call** to `heapify(arr, 7, 1)`:
  - Left child (index 3: 44) and right child (index 4: 33) both are less than 66, so no swap.

- **Third call** to `heapify(arr, 7, 0)`:
  - Left child (index 1: 66) and right child (index 2: 88), swap 99 with 88:
  - `{88, 66, 99, 44, 33, 77, 11}`
  - Call `heapify(arr, 7, 2)`: Swap 99 with 77:
  - `{88, 66, 77, 44, 33, 99, 11}`

Final max-heap is `{99, 66, 88, 44, 33, 77, 11}`.

#### Sorting the Array

2. **Extracting Elements**:
   - Swap the root with the last element and decrease the heap size.
   - Call `heapify` again to maintain the max-heap property.

For the sorted array:
- After the first extraction: `{77, 66, 88, 44, 33, 99, 11}`
- After further extractions, the elements keep getting sorted until the array becomes `{11, 33, 44, 66, 77, 88, 99}`.

Each recursive `heapify` call ensures that the largest number is always at the top of the heap, and the final result is a fully sorted array.

### Conclusion

With the code and step-by-step explanations, you can see how the Heapsort algorithm works, with each recursive step clearly outlined. It builds a pyramid structure (max-heap) first and then sorts the numbers by repeatedly extracting the largest element.

*/