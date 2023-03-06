import java.util.Arrays;

public class FirstMissingPositive
{
	public static void main(String[] args)
	{
		int[] arr={4,3,4,2,1};
		System.out.println(findFirstMissingPositive(arr));
	}

	public static int findFirstMissingPositive(int[] arr)
	{
		//basic cyclic sort
		int i=0;
		while(i<arr.length)
		{
			int crt_ind = arr[i]-1;
			if(arr[i]>0 && arr[i]<=arr.length &&arr[crt_ind] != arr[i])
			{
				swap(arr,crt_ind,i);
			}
			else
			{
				i++;
			}
		}
		//check if all the positive elements are present
		for(int j=0;j<arr.length;j++)
		{
			//we use j+1 because the element arr[j] if present will be at j-1 index;
			if(arr[j] != j+1)
			{
				return j+1;
			}
		}
		return arr.length+1;
	}
	public static void swap(int[] arr,int ind1, int ind2)
	{
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
}
