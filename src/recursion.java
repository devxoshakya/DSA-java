public class recursion {
    public static void main(String[] args) {
        for(int i=0; i<16; i++){
            System.out.print(Fibo(i)+" ");
        }
    }
    static int Fibo(int n){
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
