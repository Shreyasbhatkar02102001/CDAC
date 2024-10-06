  
 class Sorts{ 
     
     static void isort(int arr[]){
         int n = arr.length;
         for(int i = 1; i < n; i++){
             int key = arr[i];
             int j = i-1;
             while(j >= 0 && arr[j] > key){
                 arr[j+1] = arr[j];
                 j--;
             }
             arr[j+1] = key;
         }
     }
     
     static void ssort(int arr[]){
         int n = arr.length;
         for(int i = 0; i < n-1; i++){
             int minPos = i;
             for(int j = i+1; j < n; j++){
                 if (arr[minPos] > arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[minPos];
                     arr[minPos] = temp;
                 }
             }
         }
     }
     
     static void bsort(int arr[]){    // O(n^2)
         int n = arr.length;
         for (int i = 0; i < n-1; i++){
             for (int j = 0; j < n-1-i; j++){
                 if (arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }
     }
     
    static void display(int a1[])
	{
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int a1[]={2,13,24,56,45,9,30};
		display(a1);
	//	bsort(a1);
	//	display(a1);
		isort(a1);
		display(a1);
		
	}
}