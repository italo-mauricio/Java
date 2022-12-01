package Gettters;

public class Aula11 {
    //private String firstName;
    //private String secondName;

    //public void setFirstname(String firstName){

        //this.firstName = firstName;
        public static void main(String[] args) {
            User userA = new User();
            userA.setFirstName ("italo");

            System.out.println(userA.getFirstName());

        }
    }

// o "this" acessa a propriedade de campo, no caso referenciada como private