package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.element.QualifiedNameable;

public class MinMax {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int K = Integer.parseInt(in.readLine());
		int[] list = new int[N];

		for (int i = 0; i < N; i++)
			list[i] = Integer.parseInt(in.readLine());
		

		quickSort(list, 0, N-1);
		/*for (int i = 0; i < N; i++)
			System.out.println(list[i]);*/
		int unfairness = getUnfairmens(list, N, K);
		
		/*
		 * Write your code here, to process numPackets N, numKids K, and the
		 * packets of candies Compute the ideal value for unfairness over here
		 */
		System.out.println(unfairness);
	}
	private static int getUnfairmens(int a[],int size,int k)
	{
		int low=0;
		int high=k-1;
		int unfairness = Integer.MAX_VALUE;
		for (int i=0;i<size;i++)
		{
			if(high>=size)
				break;
			int un=a[high]-a[low];
			if(un<unfairness)
				unfairness=un;
			low++;
			high++;
		}
		return unfairness;
	}

	private static void quickSort(int a[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[p] is now at right place
			 */
			int pi = partition(a, low, high);

			quickSort(a, low, pi - 1); // Before pi
			quickSort(a, pi + 1, high); // After pi
		}
	}

	private static int partition(int arr[], int low, int high) {
		// pivot (Element to be placed at right position)
		int pivot = arr[high];

		int i = (low - 1); // Index of smaller element

		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++; // increment index of smaller element
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// swap arr[i + 1] and arr[high])
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return (i + 1);
	}

}
