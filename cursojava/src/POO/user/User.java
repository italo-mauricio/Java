package POO.user;


public class User {
    private boolean islogged;
    public String firstName;
    public String lastName;
    public String fullName;

    public String getFullName(){
        return firstName + " " + lastName;
    }


}
