package recursion;

public class revStr {
    public static void main(String[] args) {
        System.out.println(palindrome("ala"));
    }

    static String rev(String s){
        if(s.length() == 0){
            return "";
        }
        return s.charAt(s.length()-1) + rev(s.substring(0, s.length()-1));
    }

    static boolean palindrome(String s){
        if(s.equals(rev(s))){
            return true;
        }
        return false;
    }
}
