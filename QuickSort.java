/**
 * Quick Sort
 * 
 * @author (Puja Badola)
 * Date (2/14/2020)
 */
/**
 * Quick Sort
 * 
 * @author (Puja Badola)
 * Date (2/14/2020)
 */
public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		sort(a, 0, a.length-1);
	}

	public void sort(int [] a, int left, int right)
	{
		int p = partition(a,left, right);
		if(left < p-1)
		{
			sort(a,left,p-1);
		}
		if(p<right)
		{
			sort(a,p,right);
		}
	}
	public int partition (int [] a, int left, int right)
	{
		int pivot =left;
		int i = left;
		int k = right;

		while(i<=k)
		{
			while(a[i] < a[pivot]) 
				i++;
			
			while(a[k] > a[pivot]) 
				k--;
			
			if(i<=k)
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				i++;
				k--;
			}
		}
      return i;   
	}
}

