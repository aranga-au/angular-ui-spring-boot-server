package com.acnonline.zuul.domain.User;

/**
 * Created by Aranga on 28/03/2016.
 */
public class User
{
    private long id;
    private String firstName;
    private String lastName;
    private String location;

    public User(long id, String firstName, String lastName, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
