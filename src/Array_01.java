import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
       /* int[] marks = new int[3];
        marks [0] = 97;
        marks [1] = 87;
        marks [2] = 94;
        *//*System.out.println(marks[2]);*//*
        for ( int i=0; i<=3; i++){
            System.out.println(marks[i]);
        }*/

        /* int number [] = {1,2,3,4,5,6,7,8};
        for (int i=0; i<=i;i++){
            System.out.println("number : " + number[i]);
        } */

        Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        int number [] = new int[size];

        for (int  i=0; i<size;i++){
            number[i] = sc.nextInt();
        }
       /* for (int i=0 ; i<size;i++){
            System.out.println(number[i]);
        }*/
        int x = sc.nextInt();

        for(int i=0; i<number.length; i++){
            if (number[i] == x){
                System.out.println("x number found at index :" + x);
            }
        }

    }
}
