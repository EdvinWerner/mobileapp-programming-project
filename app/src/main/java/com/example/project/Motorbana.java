package com.example.project;

public class Motorbana {

    //Member variables and state
    private String name;

    //Constructor
    public Motorbana(String name) {
        this.name = name;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Interface
    @Override
    public String toString(){
        return name;
    }
}