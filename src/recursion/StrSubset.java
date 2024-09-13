package recursion;
public class StrSubset {
    public static void main(String[] args) {
        System.out.println(removeChar("basics.abc"));
        System.out.println(removeStr("devdevdev1234568 456developer"));
    }

    static String removeChar(String up){
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            return removeChar(up.substring(1));
        }else{
            return ch + removeChar(up.substring(1));
        } 
    }

    static String removeStr(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("dev")){
            return removeStr(str.substring(3));
        }else{
            return str.charAt(0) + removeStr(str.substring(1));
        }
    }

    static String removeStrWithString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("dev") && !str.startsWith("devloper")){
            return removeStrWithString(str.substring(3));
        }else{
            return str.charAt(0) + removeStrWithString(str.substring(1));
        }
    }

}
