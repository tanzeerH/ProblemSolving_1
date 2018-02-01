package com.solution;

public class HighestSumInArray {

	private static int[] arr= {-2, -5, 6, -2, -3, 1, 5, -6};
	
	public static void main(String[] args) {
		
		System.out.println(printMaxSum(arr));
	}
	//this is called kadanes algorithm. o(n) time solution
	private static int printMaxSum(int a[])
	{
		int len=a.length;
		int max=Integer.MIN_VALUE;
		int prev_sum=0;
		int start=0;
		int end=0;
		int s=0,e=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]+prev_sum>=arr[i])
			{
				prev_sum+=arr[i];
				e=i;
			}
			else
			{
				prev_sum=arr[i];
				s=i;
				e=i;
			}
			if(prev_sum>max)
			{
				max=prev_sum;
				start=s;
				end=e;
			}
		}
		System.out.println("maximum index: "+ start+"  "+end);
		return max;
	}
}
