package StringBufferAndDataFormatting;
import java.util.Arrays;
import java.text.DecimalFormat;

public class StringBufferDemo {
    public static void main(String[] args) {

        // StringBuffer sb = new StringBuffer();
        // sb.append("Hello");
        // sb.append(" ");
        // sb.append("World");
        // System.out.println(sb);
        
        String str = " He ll o W o r l d";
        //remove white spaces
        System.out.println(str);
        System.out.println(str.replaceAll("\\s", ""));

        // split the string

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        // roumding off 

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(1.23456789));

    }
}
