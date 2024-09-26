package StringBufferAndDataFormatting;


public class RandomString {
    public static String gereateRandomString(int length){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWZYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            int index = (int)(Math.random() * str.length());
            sb.append(str.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(gereateRandomString(200));
    }
}
