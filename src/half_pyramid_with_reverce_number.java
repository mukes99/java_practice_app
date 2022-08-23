public class half_pyramid_with_reverce_number {
    public static void main (String args[]){
        int n = 10;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
