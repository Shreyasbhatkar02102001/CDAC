class 
{

/*   Selection sort  
	 concept : Repeatedly finds the minimum element from the unsorted part and swaps it with the frist unsorted element ;

Time com[ : O(n^2)
Best case : O(n^2)
Average case : O(n^2)
Worst case : O(n^2)

Technique: Internal Sorting
Not a stable algorithm

*/

	static void selectionSort(int arr[]){
		int n = arr.length;
		
		for (int i = 0; i < n; i++){
			int min = i;
			
			for (int j = i; i < n; j++){
				if (arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	static void display(int arr[]){
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String args[]){
		int arr[] = {4,3,2,10,12,1,5,6};
		
		selectionSort(arr);
		display(arr);
	}
}