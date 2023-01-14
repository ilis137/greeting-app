package com.greetingapp.Model;

public class User {
    String firstName;
    String lastName;

    public User(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
}
