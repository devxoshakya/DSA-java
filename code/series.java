package code;

import java.util.Scanner;

public class series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = input.nextInt();
        int t1,t2,nextTerm;
        t1 = -1;
        t2 = 1;
        nextTerm = t1+t2;
        for (int i = 0; i < a; i++) {

            System.out.print(nextTerm+"\t");
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
    }
}
