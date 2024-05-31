package javabooleancodes;
import java.util.Scanner;

import javacode.sortStudents;

interface Bank {
    final static int a = 10;
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}

class Interfaceconcept {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
        b = new PNB();

        System.out.println("ROI: " + b.rateOfInterest());
    }
}
