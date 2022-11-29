package POO.user;

public class App {
    public static void main(String[] args) {
        User userA = new User();
        userA.firstName = "Italo";
        userA.lastName = "Mauricio";
        String fullName = userA.getFullName();

        System.out.println(fullName);
    }
}
