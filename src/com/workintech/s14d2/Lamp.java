package com.workintech.s14d2;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        String pil = battery ? " battery full " : " battery empty ";
        return style + pil + globRating + " rating ";
    }
}
