package com.henge.springcheckbox.models;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private String username;
    private int age;
    private List<HobbyModel> hobbies;
    private List<String> hobbyNames;

    public UserModel() {
        username = "";
        age = 0;
        hobbies = new ArrayList<HobbyModel>();
        hobbyNames = new ArrayList<String>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<HobbyModel> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<HobbyModel> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getHobbyNames() {
        return hobbyNames;
    }

    public void setHobbyNames(List<String> hobbyNames) {
        this.hobbyNames = hobbyNames;
    }
}
