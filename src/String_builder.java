public class String_builder {
    public static void main(String[] args) {
       /* StringBuilder sb = new StringBuilder("Mukesh");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.insert(2,"nkkk");
        System.out.println(sb);
//        delete
        sb.delete(2,5);
        System.out.println(sb);*/

        StringBuilder sb = new StringBuilder("Mukesh ");
        sb.append("hello ");
        System.out.println(sb.length());
        System.out.println(sb);

    }
}
