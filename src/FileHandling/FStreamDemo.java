
package FileHandling;
import java.io.InputStreamReader;
import java.io.IOException;

public class FStreamDemo {
    public static void main(String[] args){

        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter the file name: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.print((char)letters);
                letters = isr.read();
            }
            // isr.close();
            System.out.println();
        } catch(IOException e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
