import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] unSArr={4,3,2,1};
		System.out.println(Arrays.toString(unSArr));
		Bsort(unSArr);
		System.out.println(Arrays.toString(unSArr));
	}

	public static void Bsort(int[] arr)
	{
		int len = arr.length-1;
		for(int i=0;i<=len;i++)
		{
			boolean didNotSwap = true;
			for(int j=0;j<len-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					didNotSwap = false;
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(didNotSwap)
			{
				return;
			}
		}
	}
}