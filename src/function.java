
import java.util.Scanner;

public class function {
    public static void myName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        myName(name);
    }
}
