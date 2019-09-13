package com.hust.soict.haihang.helper;

public class InsertionSort implements NumberSorter {
	public void sort(int arr[]) {
		int n = arr.length;
		for(int i = 1 ; i < n; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j >= 0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
}
