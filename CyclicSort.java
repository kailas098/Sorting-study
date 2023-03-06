import java.util.Arrays;

public class CyclicSort
{
	public static void main(String[] args)
	{
		int[] unSArr={4,3,2,1};
		System.out.println(Arrays.toString(unSArr));
		cSort(unSArr);
		System.out.println(Arrays.toString(unSArr));
	}

	public static void cSort(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int crt_ind = arr[i]-1;
			if(arr[crt_ind] != arr[i])
			{
				swap(arr,crt_ind,i);
			}
			else
			{
				i++;
			}
		}
	}

	public static void swap(int[] arr, int ind1, int ind2)
	{
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}


}
