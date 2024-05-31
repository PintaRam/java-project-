package javacode;
import java.util.*;
public class Lamp {
    boolean lampOn = false;

    void toggleLamp() {
        lampOn = !lampOn;
    }

    boolean getLampState() {
        return lampOn;
    }

    void reportStatus() {
        if (getLampState()) {
            System.out.println("The lamp is on");

        } else {
            System.out.println("The lamp is off");
        }
    }

    public static void main(String[] args) {
        Lamp l = new Lamp();
        l.toggleLamp();
        l.reportStatus();
        l.toggleLamp();
        l.reportStatus();
    }

}
