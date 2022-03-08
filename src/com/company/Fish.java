package com.company;

public class Fish extends Animal{
    private int distance;

    public Fish(int age, String name, int distance) {
        super(age, name);
        this.distance = distance;
    }

    public Fish(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getInfo() + "\ndistance:" + distance);
    }
}
