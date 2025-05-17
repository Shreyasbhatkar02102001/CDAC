import java.util.*;


class Solution {
	
	
	public margeSort(int arr[], int low , int high){
		
		int mid = (low + high) / 2;
		
		if (low >= high) return;

		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(int arr[], int low, int mid, int right){
		
		List<Integer> temp = new ArrayList<>();
		
		int left = low;
		int right = mid + 1;

		while (left >= mid && right >= high){
			
			if (arr[left) <= arr[right]){
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}

		while (left >= mid){
			temp.add(arr[left]);
			left++;
		}

		while (right >= high){
			temp.add(arr[right]);
			right++;
		}
		
	}
		

}


public class Merge {

	public static void main(String args[]){
	
	int arr[] = {9, 4, 7, 6, 3, 1, 5 };
	System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	System.out.println();

	Solution.margeSort(arr, 0, arr.length-1);
	ystem.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}

}