package Gettters;

public class User {

        private String firstName;
        public String lastName;

    // Setters
    public void setFirstName(String firstName) {

        this.firstName = firstName.toUpperCase();

    }

    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase();
    }

    public String getLastName(){
        return lastName;
    }
    // Getters
    public String getFirstName(){
        return firstName;
    }

}





