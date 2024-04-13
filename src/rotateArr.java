public class rotateArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, arr.length-k-1, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        System.out.println(java.util.Arrays.toString(arr));
        
    }

    static void rotate(int[] nums) {
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
