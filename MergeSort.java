/**
 * Merge Sort
 * 
 * @author (Puja Badola)
 * Date (2/14/2020)
 */
public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		int mid=a.length/2;
		if(a.length<2)
		{
			return;
		}
	int [] Left = new int [mid];
	int [] Right = new int [a.length-mid];


	for (int n = 0; n < mid; n++)
	{
		Left[n] = a[n];
	}
	for (int m = mid; m <a.length; m++)
	{
		Right[m-mid]=a[m];
	}
	sort(Left);
	sort(Right);
	merge(a, Left, Right);
	}
	public void merge(int [] a, int[] l, int[] r)
	{
		int n1 = l.length;
		int n2 = r.length;
		int i=0;
		int j=0;
		int index=0;
	//merge
		while(i < n1 && j < n2)
		{
			if(l[i] <= r[j])
			{
				a[index] = l[i];
				i++;

			}
			else
			{
				a[index] = r[j];
				j++;
			}
			index++;
		}

		while(i < n1)
		{
			a[index]= l[i];
			index++;
			i++;
		}
		while(j < n2)
		{
			a[index]= r[j];
			index++;
			j++;
		}
	}
}