public class powOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        return mul(n,1);
        
    }
    private static boolean mul(int num, int res){
        if(num==res){
            return true;
        }
        if(res>num){
            return false;
        }
        return mul(num, res*3);
    }
}
