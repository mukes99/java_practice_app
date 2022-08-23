public class String03 {
    public static void main(String[] args) {
//        1 s1> s2 : +ve value
//        2 s1 ==s2 : 0
//        3 s1 < s2 -ve value
        String name1 = "Mukesh";
        String name2 = "Kumar";
       /* if (name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }else {
            System.out.println("Not Not Equal");
        }*/

       /* if (name1 == name2 ) {
            System.out.println("String are equal");
        }else {
            System.out.println("Not Not Equal");
        }*/

        if (new String("Mukesh") == new String("Mukesh")) {
            System.out.println("String are equal");
        }else {
            System.out.println("String Not Equal");
        }
    }
}
