package Recursion;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        System.out.println(Sorted(arr, 0));
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
    }
    static boolean Sorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && Sorted(arr, index+1);
    }
}
