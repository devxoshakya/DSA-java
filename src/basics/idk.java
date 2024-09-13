package basics;

import java.util.Arrays;

public class idk {
    public static void main(String[] args) {
        int num = 567896696;
        System.out.println(Arrays.toString(toArr(num)));
        int[] res = toArr(num);
        System.out.println(toNum(res));
    }
    public static int[] toArr(int n){
        int len = (int) (Math.log10(n)+1);
        int[] res = new int[len];
        for(int i=0; i<len; i++){
            res[len-1-i] = n%10;
            n = n/10;
        }
        return res;
    }
    public static int toNum(int[] a){
        int i, k = 0;
        for (i = 0; i < a.length; i++)
        k = 10 * k + a[i];
        return k;
    }

}

