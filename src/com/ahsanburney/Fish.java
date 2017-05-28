package com.ahsanburney;

/**
 * Created by Kulsum on 5/28/2017.
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight,int gills,int eyes,int fins) {
        super(name, brain, body, size, weight);
        this.gills=gills;
        this.eyes=eyes;
        this.fins=fins;
    }

    private void rest(){
        System.out.println("fish.rest called");
    }

    private void moveMuscles(){
        System.out.println("fish.moveMuscles called");
    }

    private void backFin(){
        System.out.println("fish.backfin called");
    }

    private void swim(int speed){
        moveMuscles();
        backFin();
        super.move(speed);
        System.out.println("fish.swim called");
    }
}
