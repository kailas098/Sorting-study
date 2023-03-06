import java.util.Arrays;

public class FIndMissingNum
{
	public static void main(String[] args)
	{
		int[] arr={6,5,4,2,2,1};
		System.out.println(findMissingNum(arr));
		System.out.println(Arrays.toString(findMissingNums(arr)));
	}

	//swap===============================================
	public static void swap(int[] arr, int ind1, int ind2)
	{
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

	//find the missing number============================
	public static int findMissingNum(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i] != i && arr[i]<arr.length)
			{
				swap(arr,arr[i],i);
			}
			else
			{
				i++;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] != j)
			{
				return j;
			}
		}
		return arr.length;
	}

	//find all missing numbers============================
	public static int[] findMissingNums(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int crt_ind = arr[i]-1;
			if(arr[i]<arr.length && arr[i] != arr[crt_ind])
			{
				int temp = arr[crt_ind];
				arr[crt_ind]=arr[i];
				arr[i]=temp;
			}
			else
			{
				i++;
			}
		}

		System.out.println(Arrays.toString(arr));

		int res_size=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]-1 != j)
			{
				res_size++;
			}
		}
		int[] res = new int[res_size];

		int k=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]-1 != j)
			{
				res[k]=j+1;
				k++;
			}
		}
		return res;
	}
}
