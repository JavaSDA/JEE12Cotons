package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private boolean likeCotons, hasCotons;
    private List<Coton> cotonsOwned;


    public Person(String name, int age, boolean likeCotons, boolean hasCotons) {
        this.name = name;
        this.age = age;
        this.likeCotons = likeCotons;
        this.hasCotons = hasCotons;
        this.cotonsOwned = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isLikeCotons() {
        return likeCotons;
    }

    public boolean isHasCotons() {
        return hasCotons;
    }

    public List<Coton> getCotonsOwned() {
        return cotonsOwned;
    }

    public void setCotonsOwned(List<Coton> cotonsOwned) {
        this.cotonsOwned = cotonsOwned;
    }
}
