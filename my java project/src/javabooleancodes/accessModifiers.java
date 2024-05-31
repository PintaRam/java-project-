package javabooleancodes;

import javabooleancodes.*;


class java {
    private int max = 500;

    /*
     * private java() {
     * System.out.println("java"); // level of access is only to the class it self.
     * }
     */

    protected int min = 200;
    int size = 400;
    public int size1 = 600;
}

public class accessModifiers {
    public static void main(String[] args) {
        java obj = new java();
        Myclass ob = new Myclass();
        System.out.println(ob.num1);

        // System.out.println(obj.max); // compilation error because level of access is
        // only to the class itself.
        System.out.println(obj.min);
        System.out.println(obj.size);
        System.out.println(obj.size1);
        System.out.println(0 / 200);
    }
}
