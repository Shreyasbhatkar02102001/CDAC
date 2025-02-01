package selection;

public class Selection {
	
	public static void ss(int n[]) {
		int min, temp, a = n.length;
		
		for (int i = 0; i < a; i++) {
			min = i;
			for (int j = i +1; j < a; j++) {
				
				if (n[min] >  n[j] ) {
					min = j;
				}
			}
			temp = n[min];
			n[min] = n[i];
			n[i] = temp;
		}
		
		System.out.print("Array : ");
		for (int i = 0; i < a; i++) {
			System.out.print(" "+n[i]+" ");
		}
	}
	
	public static void bubble_Sort(int n []) {
		int temp,a= 0, len = n.length;
		
		for (int i = 0; i < len; i++) {
			
			int flag = 0;
			for (int j = 0; j < len - 1 - i; j++) {
				
				if (n[j] < n[j+1]) {
					temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		
		System.out.print("Array : ");
		for (int i = 0; i < len; i++) {
			System.out.print(" "+n[i]+" ");
		}
	}
	
	public static void insertion_sort(int n[]) {
		int temp, j, len = n.length;
		
		for (int i = 1; i < len; i++) {
			
			temp = n[i];
			j = i;
			while (j > 0 && n[j-1] > temp) {
				
				n[j] = n[j-1];
				j = j - 1;
			}
			n[j] = temp;
		}
		
		System.out.print("Array : ");
		for (int i = 0; i < len; i++) {
			System.out.print(" "+n[i]+" ");
		}
	}
	
	public static void mergesplit(int a[], int l, int h) {
		
		if (l < h) {
			
			int m = l + (h - l) / 2;
			mergesplit(a, l, m);
			mergesplit(a, m+1, h);
			merge(a, l, m, h);
		}
	}
	
	public static void merge(int a[], int l, int m, int h) {
		
		int n1 = m - l + 1;
		int n2 = h - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for (int i = 0; i <n1; i++) L[i] = a[l + i]; 
		for (int j = 0; j <n2; j++) R[j] = a[m + 1 + j];
		
		int i = 0, j = 0;
		int k = l;
		
		while ( i < n1 && j < n2 ) {
			
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;	
			}
			else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
		
//		display(a);
		
	}
	
	public static void display(int a[]) {
		System.out.print("Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int []n = {134,45,23,76,12,789,54};
		
//		ss(n);
//		bubble_Sort(n);
//		insertion_sort(n);
		mergesplit(n, 0, n.length - 1);
		display(n);
		

	}

}
