package com.Test.Array;

public class ArraySwap {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = new int[a.length];
		for(int i=0, j=4; i<4; i++,j--)
		{
			b[i] = j;
		}
		
		print(a);
		print(b);
		
		for(int i=0; i<a.length; i++)
		{
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
		print(a);
		print(b);

	}
	public static void print(int a[])
	{
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

}
