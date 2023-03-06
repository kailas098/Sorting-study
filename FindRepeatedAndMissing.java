import java.util.Arrays;

public class FindRepeatedAndMissing
{
	public static void main(String[] args)
	{
		int[] arr={2,2,1,5,3,6,7};
		System.out.println(Arrays.toString(findMissingANdRepeated(arr)));
	}

	public static int[] findMissingANdRepeated(int[] arr)
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
		System.out.println(Arrays.toString(arr));
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] != j+1)
			{
				return new int[]{arr[j],j+1};
			}
		}
		return new int[]{-1,-1};
	}

	public static void swap(int[] arr, int ind1, int ind2)
	{
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
}
