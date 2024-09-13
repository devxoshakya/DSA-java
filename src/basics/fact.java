package basics;

public class fact {
    public static void main(String[] args) {
        System.out.println(sumofdig(1342));
    }
    static int Fact(int n){
        if (n==0) {
            return 1;
        }
        return n*Fact(n-1);
    }

    static int sumofdig(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumofdig(n/10);
    }
}
