package com.techdecode.dependanytest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hero {


    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("Username")
    @Expose
    private String Username;
    @SerializedName("email")
    @Expose
    private String email;


    public Hero(int id, String username, String email,String name) {
       this.id = id;
        this.name=name;
        this.Username = username;
        this.email = email;

    }


    public int getId() { return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
