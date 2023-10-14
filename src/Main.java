public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        person p = new person("ben");
        person p1 = new person("dinura");
        person p2 = new person("you");



        p.setSurname("ben");
        p.setAge(21);
        p.displayName();

    }

}