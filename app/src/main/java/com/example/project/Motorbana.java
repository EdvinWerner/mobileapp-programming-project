package com.example.project;

public class Motorbana {

    // Member variables and state
    private String name;
    private int size;

    // Constructor
    public Motorbana(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Interface
    @Override
    public String toString() {
        return String.format("%s (Banlängd: %d m)", name, size);
    }
}
