import java.util.Scanner;

public class meathod_parameeter {


    /*public static void myMeathod(int age) {
    if(age <18){
        System.out.println("Child");
    }else{
        System.out.println("Adult");
    }
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();


    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Enter your age");
        age = input.nextInt();

        if (age <= 18) {
            System.out.println("You are a child!");

        }

        else if (age < 59 && age > 19) {
            System.out.println("You are an adult!");
        }

        else if (age >= 60); {

            System.out.println("You are old!");

        }
    }
    }

