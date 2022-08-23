import java.util.Scanner;

public class array_012 {
    public static void main(String[] args) {
       /* System.out.println("Enter Your Name: ");
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();
        System.out.println("Your Name is :" + name);*/


        String first_name = "Mukesh Kumar ";
        String last_name = "Verma ";
        int age = 23;
        String name = first_name + last_name;
        System.out.println(name.length() +  "age " + age);
        for (int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }


    }
}
