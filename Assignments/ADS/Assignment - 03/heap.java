class heap{
	
	private int arr[] = {10, 15, 20, 17};
	private int l,r,n,largest;
	
	heap(){
		largest = l = r = 0;
		n = arr.length;
	}
	
	void heapify(int arr[], int n, int i){
		largest = i;
		l = (2 * i) + 1;
		r = (2 * i) + 2;
		
		if ( l < n && arr[l] > arr[largest]){
			largest = l;
		}
		if ( r < n && arr[r] > arr[largest]){
			largest = r;
		}
		
		if (largest != i){
			int temp = arr[i];
			arr[i] =  arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
		
		//heapify(arr, n, largest);
	}
	
	
	
	void heapsort(int arr[]){
		n= arr.length;
		
		for (int i = (n/2)-1; i >= 0; i--){
			heapify(arr, n, i);
		}
		
		for (int i = n-1; i >= 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
		
		
	}
	
	void display(int arr[]){
		for (int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		heap h1 = new heap();
		h1.display(h1.arr);
		
		h1.heapsort(h1.arr);
		h1.display(h1.arr);
		
		System.out.println("Min : "+ h1.arr[0]);
		int n = h1.arr.length;
		System.out.println("Max : "+ h1.arr[n-1]);
		
	}
	
	
	
	
	
	
	
	
}