package com.hust.soict.haihang.helper;

public class ShellSort implements NumberSorter{
	public void sort(int arr[]) {
		int n = arr.length;
		for(int h = n/2; h > 0; h/=2) {
			for(int i = h; i < n; i++) {
				int temp = arr[i];
				int j;
				for(j = i; j >= h && arr[j-h] > temp; j -= h) {
					arr[j] = arr[j-h];
				}
				arr[j] = temp;
			}
		}
	}
}
