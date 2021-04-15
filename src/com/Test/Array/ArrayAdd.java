package com.Test.Array;

public class ArrayAdd {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		int sum =0;
		int an = num(a);
		int bn = num(b);
		sum = an + bn;
		System.out.println(sum);
	}
	
	public static int num(int a[]){
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			int n = a[i];
			sum = sum * 10 + n;
		}
		return sum;
	}
}
