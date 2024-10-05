
class heapMin{
	
	protected int arr[] = {10, 15, 20, 17};
	int smallest, l, r, n;
	
	heapMin(){
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
		
		//heapify(arr, i, 0);
	}
	
	void display(int arr[]){
		
		for(int i = n-1; i >= 0; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		heapMin h1 = new heapMin();
		
		h1.display(h1.arr);
		h1.heapsort(h1.arr);
		h1.display(h1.arr);
		
		System.out.print("Min : "+ h1.arr[0]);
		
	}

}