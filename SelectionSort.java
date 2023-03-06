import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] unSArr={4,3,2,1};
		System.out.println(Arrays.toString(unSArr));
		sSort(unSArr);
		System.out.println(Arrays.toString(unSArr));
	}

	public static void sSort(int[] arr)
	{
		int len = arr.length-1;
		while(len>=0)
		{
			int max_ele=arr[0], ind = 0;
			for(int i=0;i<=len;i++)
			{
				if(arr[i]>max_ele)
				{
					ind = i;
				}
			}
			int temp = arr[len];
			arr[len] = arr[ind];
			arr[ind]=temp;
			len--;
		}
	}

}
