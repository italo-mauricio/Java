package Gettters;

import POO.user.Address;

public class User {

        public String firstName;
        public String lastName;
        public String fullName;
        public Address address;

        public String getFullName(){
            fullName =  firstName + " " + lastName;
            return fullName;
        }


    }


