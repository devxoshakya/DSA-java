package Recursion;

public class invertedTriangle {
    public static void main(String[] args) {
        pattern(5, 0);
    }
    static void pattern(int rows, int collums){
        if(rows == 0){
            return;
        }
        if(collums < rows){
            System.out.print("* ");
            pattern(rows, collums+1);
        }
        else{
        System.out.println();
        pattern(rows-1, 0);
        }
    }

}
