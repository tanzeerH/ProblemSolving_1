package com.solution;

public class HeapSort {

	private class Heap
	{
		int SIZE=10;
		int[] elems=new int[SIZE];
		int counter=-1;
		
		public int getParnetIndex(int index)
		{
			return index/2;
		}
		public int getParnet(int index)
		{
			return elems[index/2];
		}
		public int getLeftChildIndex(int index)
		{
			return 2*index+1;
		}
		public int getLefChild(int index)
		{
			return elems[2*index+1];
		}
		public int getRightChildIndex(int index)
		{
			return 2*index+2;
		}
		public int getRightChild(int index)
		{
			return elems[2*index+2];
		}
		public void insert(int value)
		{
			int index=counter+1;
		}
	}
	public static void main(String[] args) {
		
	}
}
