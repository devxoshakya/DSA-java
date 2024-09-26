package FileHandling;
import java.io.*;

public class CreateFile {
    public static void main(String[] args){

        try(FileWriter fw = new FileWriter("src/FileHandling/sample.txt", true)){
            fw.write("Hello World");
            // fw.append("!");
            System.out.println("File created successfully");
            
        } catch(IOException e){
            System.out.println("Error writing file " + e.getMessage());
        }
    }
}
