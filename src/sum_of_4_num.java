import java.util.*;
public class sum_of_4_num {
    public static void main(String [] args){

/*        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;

        for (int i = 1; i<=n;i++){
            sum = sum + i;

        }
        System.out.println(sum);*/

        int n = 10;
        for (int i=1; i<=n; i++){
            for (int j=i; j<=i; j++){
                System.out.print(2*i + " ");
            }
            System.out.println();
        }
    }
}
