package javacode;

import java.util.*;

class student {
    private int roll;
    private String name;
    private int marks;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;

    }

    public int getMarks() {
        return marks;
    }
}

public class sortStudents {
    public static void main(String[] args) {
        ArrayList<student> stu = new ArrayList<student>();
        student st1 = new student();
        st1.setRoll(101);
        st1.setName("amit");
        st1.setMarks(56);

        student st2 = new student();
        st2.setRoll(102);
        st2.setName("anil");
        st2.setMarks(66);

        student st3 = new student();
        st3.setRoll(103);
        st3.setName("ankit");
        st3.setMarks(76);

        stu.add(st1);
        stu.add(st2);
        stu.add(st3);
        ListIterator listItr = (ListIterator) stu.listIterator();
        while (listItr.hasNext()) {
            student stud = (student) listItr.next();
            System.out.println(" " + stud.getRoll());
            System.out.println(" " + stud.getName());
            System.out.println(" " + stud.getMarks());
        }
        while (listItr.hasPrevious()) {
            student stud = (student) listItr.previous();
            System.out.println(" " + stud.getRoll());
            System.out.println(" " + stud.getName());
            System.out.println(" " + stud.getMarks());
        }
    }
}
