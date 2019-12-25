package Dummy;

class Sort {

	public void divideArray(int arr[], int low, int high) {
		int mid = 0;
		if (low < high) {

			mid = (low + high) / 2;
			divideArray(arr, low, mid);
			divideArray(arr, mid + 1, high);
			mergeArray(arr, low, mid, high);
		}
	}

	public void mergeArray(int arr[], int low, int mid, int high) {

		int leftSize = mid - low + 1;
		int rightSize = high - mid;

		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];

		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = arr[low + i];

		for (int j = 0; j < rightArray.length; j++)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = low;
		while (i < leftSize && j < rightSize) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < leftSize) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < rightSize) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}

	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

public class MergeSort {

	public static void main(String args[]) {
		int[] array = { 8, 3, 6, 2, 9 };
		Sort sort = new Sort();
		sort.divideArray(array, 0, array.length - 1);

	}
}
