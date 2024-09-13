package basics;

public class bitwise {
    public static void main(String[] args) {
        int[] res = {-2,0,10,-19,4,6,-8};
        System.out.println(is(res));
    }
    static boolean is(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>=0; j--){
                if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
