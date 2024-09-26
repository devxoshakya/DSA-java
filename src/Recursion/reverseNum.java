package Recursion;
public class reverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        int base = (int)Math.log10(n);
        return n%10 * (int)Math.pow(10,base) + reverse(n/10);
    }
}
