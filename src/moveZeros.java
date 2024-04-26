import java.lang.reflect.Array;
import java.util.*;

/**
 * moveZeros
 */
public class moveZeros {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] nums){
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]==0){
                while(nums[j]==0 && j>i){
                    j--;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
            i++;
        }
    }
}