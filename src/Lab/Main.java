package Lab;

public class Main {
    public static void main(String[] args) {
        Variables num = new Variables(9,9);
        System.out.println("sum is : " + Variables.add());
        Variables.x = 20;
        Variables.y = 30;
        System.out.println("sum is : " + Variables.add());

    }
}
