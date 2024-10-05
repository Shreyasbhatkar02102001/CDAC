import java.util.Scanner;
class heapKth{
	
	protected int arr[] = {10, 15, 20, 17};
	int smallest, l, r, n;
	
	heapKth(){
		smallest = l = r = 0;
		n = arr.length;
	}
	
	void heapify(int arr[], int n, int i){
		
		smallest = i;
		l = (2 * i) + 1;
		r = (2 * i) + 2;
		
		if (l < n && arr[l] < arr[smallest]){
			smallest = l;
		}
		if (r < n && arr[r] < arr[smallest]){
			smallest = r;
		}
		
		if (smallest != i){
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			
			heapify(arr, n, smallest);
		}
	}
	
	void heapsort(int arr[]){
		
		for (int i = (n/2)-1; i >= 0; i--){
			heapify(arr, n, i);
		}
		
		for (int i=n-1; i >=0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			
			heapify(arr, i, 0);
		}
	}
	/*
	void display(int arr[]){
		
		for(int i = n-1; i >= 0; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}*/
	
	void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int k = sc.nextInt();
		heapKth h1 = new heapKth();
		
		System.out.print("Original array: ");
		h1.display(h1.arr);
		
		h1.heapsort(h1.arr);
		
		System.out.print("Sorted array: ");
		h1.display(h1.arr);
		//System.out.print("Kth element : "+ h1.arr[k]);
		
		
		if (k >= 0 && k < h1.arr.length) {
            System.out.print("Kth element: " + h1.arr[k]);
        } else {
            System.out.print("Index out of bounds.");
        }
	}

}