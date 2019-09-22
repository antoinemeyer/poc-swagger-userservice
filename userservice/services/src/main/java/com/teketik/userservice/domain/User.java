package com.teketik.userservice.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 7720156200884224143L;
    
    private Long id;
    
    private String firstName;

    private String lastName;
    
    public User(Long id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}

