public class ValidEmail {
    public static void main(String[] args) {
        String regex="\\w+@(\\w+\\.\\w+)$";
        String email1="vantoan@gmail.com";
        String email2="n@gmail.com";
        String email3="@gmail.com";
        String email4="vantoan@gmail.";
        System.out.println(email1.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));
        System.out.println(email4.matches(regex));
    }
}
