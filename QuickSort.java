public class QuickSort implements SortingAlgorithm {

	public void qs(int[] a, int start, int end) {
		if (start < end) {
			int p = partition(a, start, end);
			qs(a, start, p-1);
			qs(a, p+1, end);
		}
	}

	public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
	}

	public void sort(int[] a) {
		qs(a, 0, a.length-1);
	}
}
