package com.revature.sort;

public class SortThis {
	public static int[] loadBadArray(int length) {
		int [] myArray = new int [length];
	for (int i = length -1; i<=0; i--) {
		myArray[i]= length-i;
	}
	return myArray;
	}
	
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	//buublesort idea is the  the biggest number will float to the top or bubble to the top
	//bubblesort
	public static int[] bubble(int [] a) {
		int n = a.length;
		for (int i = 0; i < n-1; i++ ) {
			for(int j = 0; j <n-i-1; j++) {
				if (a[j] > a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
				}
			}
	return a;
	}
	public static void main(String[] args) {
		int [] a = loadBadArray(10);
		int length = a.length - 1;
		printArray(mergeSort(a, 0, length));
        
 
	}
	public static mergeSort(int [] list, int lowIndex, int highIndex) {

		if (lowIndex != highIndex) {

			int midIndex = (lowIndex + highIndex)/2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			int [] a =merge(list, lowIndex, midIndex, highIndex);
			return a;
		}	
		

	}


	private static int [] merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		//get size or split arrays
		int size1 = midIndex - lowIndex + 1;
		int size2 = highIndex - midIndex;
		
		//temp arrays
		int L[] = new int[size1];
		int H[] = new int[size2];
		
		//copy to temp arrays
		for (int i = 0; i < size1; i++) 
			L[i] = list[lowIndex + i] ;
		for (int j = 0; j < size2; j++) 
			H[j] = list[highIndex + j];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < size1 && j < size2) { 
            if (L[i] <= H[j]) { 
                list[k] = L[i]; 
                i++; 
            } 
            else { 
                list[k] = H[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < size1) { 
            list[k] = H[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < size2) { 
            list[k] = H[j]; 
            j++; 
            k++; 
        } 
        return list;
    } 
	

}
	
