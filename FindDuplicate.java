import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate
{
	public static void main(String[] args)
	{
		int[] arr={2,4,1,5,2,6,6,6};
		System.out.println(findDupNum(arr));
		System.out.println(findAllNums(arr));
	}

	public static int findDupNum(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int crt_ind = arr[i]-1;
			if(arr[crt_ind] != arr[i])
			{
				int temp = arr[crt_ind];
				arr[crt_ind] = arr[i];
				arr[i]=temp;
			}
			else
			{
				if(arr[i] != i+1)
				{
					return arr[i];
				}
				i++;
			}
		}
		return -1;
	}

	public static List<Integer> findAllNums(int[] arr)
	{
		List<Integer> ans = new ArrayList<Integer>();
		int i=0;
		while(i<arr.length)
		{
			int crt_ind = arr[i]-1;
			if(arr[crt_ind] != arr[i])
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
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] != j+1 )
			{
				if(!ans.contains(arr[j]))
				{
					ans.add(arr[j]);
				}
			}
		}
		return ans;
	}
}
