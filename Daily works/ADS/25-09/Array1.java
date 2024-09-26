
class Array{

	static int insert(int arr[], int key, int capacity){
	
		if (arr.length() > capacity){
			System.out.println("Arrays is full!);
			return size;
		}
	
	
	}

	static int search(int arr[], int key){
	
		for ( int i = 0; i < arr.length(); i++){
		
			if ( key == arr[i]){
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]){
	
		int arr[] = new int[100];
		arr[] = {12,23,34,45,56,67,78,89,90,100};
		
		for ( int i = 0; i < arr.length(); i++){
			System.out.print(arr[i] + " ");
		}
		
		// search
		int key =  56;
		int pos = search(arr,key);
		
		if (pos != -1){
			System.out.println("Found");
		}
		else{
			System.out.println("not Found");
		}
		
		int key = 89;
		size = 
		
	
	}

}