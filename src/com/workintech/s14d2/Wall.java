package com.workintech.s14d2;

public class Wall {
    private String direction;

    public Wall(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }

    public void create(){
        System.out.println("This wall faces " + direction + ".");
    }
}
