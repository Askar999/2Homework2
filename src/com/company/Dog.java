package com.company;

public class Dog extends Animal{
    private int fightsNumber;

    public Dog(int age, String name, int fightsNumber) {
        super(age, name);
        this.fightsNumber = fightsNumber;
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getInfo() + "\nfightsNumber:" + fightsNumber);
    }
}
