package com.example.formofarmor;

public class PersonModel {
    private int id;
    private String name;
    private String friendsCount;

    public PersonModel(int id, String name, String friendsCount) {
        this.id = id;
        this.name = name;
        this.friendsCount = friendsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(String friendsCount) {
        this.friendsCount = friendsCount;
    }
}
