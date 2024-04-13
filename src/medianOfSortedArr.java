public class medianOfSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {1, 3,5,6,7};
        int[] nums2 = {2};
        System.out.println((findMedianSortedArrays(nums1, nums2)));
    }
    static double findMedianSortedArrays(int[] left, int[] right) {
         int i,j,k;
        i=0;j=0;k=0;
        int[] ans = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }
            else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans.length%2==0? (double)(ans[ans.length/2] + ans[ans.length/2 - 1])/2 : ans[ans.length/2];
    }
}
