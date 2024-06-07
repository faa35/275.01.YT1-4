//this is where we are going to keep all of our users data

package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    


    // this is a model class
    // this includes 3 attributes
    private String name;
    private String password;
    private int size;
    // mouse right click -> source action -> generate getters and setters
    // this will generate the getters and setters for the class
    // we can also generate the constructor
    // mouse right click -> source action -> generate constructor using fields
    // first we will generate the constructor


    // this first constructor will not have any attributes from above
    public User() {
    }


    // this second constructor will have all the attributes from above
    // this constructor will take all three parameters
    public User(String name, String password, int size) {
        this.name = name;
        this.password = password;
        this.size = size;
    }

    // now we will generate the getters and setters
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public int getUid() {
        return uid;
    }


    public void setUid(int uid) {
        this.uid = uid;
    }
    

    

    
}
