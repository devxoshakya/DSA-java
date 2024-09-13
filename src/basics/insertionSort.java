package basics;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {9,9,9,1,0,-1,90,2,-100};
        Sort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    
    static void Sort(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1; j>0; j--){
                if (arr[j]<arr[j-1]) {
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
            }
        }
    }
}
