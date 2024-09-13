package basics;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        Sort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    
    static void Sort(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
