import java.util.Scanner;

public class factorial {
    public static void fact(int n) {
        if(n<0){
            System.out.println("Invaild Number");
            return;
        }
        int factorialNumber = 1;
        for (int i=n; i>=1; i--){
            factorialNumber = factorialNumber*i;
        }
        System.out.println(factorialNumber);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
