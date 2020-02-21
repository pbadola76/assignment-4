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

	public void sort(int [] a, int start, int end)
	{
		int p = partition(a,start, end);
		if(start < p-1)
		{
			sort(a,start,p-1);
		}
		if(p<end)
		{
			sort(a,p,end);
		}
	}
	public int partition (int [] a, int start, int end)
	{
		int pivot = end;
		int i = start;
		int k = start;

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
