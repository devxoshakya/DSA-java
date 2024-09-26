package FileHandling;
import java.io.*;

public class FileDemo {
    public static void main(String[] args){

        try(FileReader fs = new FileReader("src/FileHandling/FileDemo.java")){
            System.out.println("Enter the file name: ");
            int letters = fs.read();
            while(fs.ready()){
                System.out.print((char)letters);
                letters = fs.read();
            }
            // fs.close();
            System.out.println();
        } catch(IOException e){
            System.out.println("Error reading file " + e.getMessage());
        }
    }
}
