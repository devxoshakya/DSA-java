import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,6,8,9,10};
        Sort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] n){
        int i=0;
        while (i<n.length) {
            int correct = n[i] - 1;
            if(n[i]!=n[correct]){
                int t = n[i];
                n[i] = n[correct];
                n[correct] = t;
            }else{
                i++;
            }

        }
    }
}
