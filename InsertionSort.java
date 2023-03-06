import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] unSArr={4,3,2,1};
		System.out.println(Arrays.toString(unSArr));
		iSort(unSArr);
		System.out.println(Arrays.toString(unSArr));
	}

	public static void iSort(int[] arr)
	{
		int len = arr.length-1;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}
}
