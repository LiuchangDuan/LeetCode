import java.util.Arrays;


public class QuickSort1 {
	
	public static void main(String[] args) {
		int[] x = {9, 2, 4, 7, 3, 7, 10};
		System.out.println(Arrays.toString(x));
		
		int left = 0;
		int right = x.length - 1;
		
		quickSort(x, left, right);
		System.out.println(Arrays.toString(x));
		
	}

	public static int partition(int arr[], int left, int right) {
		int i = left;
		int j = right;
		int temp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		};
		return i;
	}
	
	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
	}
	
}
