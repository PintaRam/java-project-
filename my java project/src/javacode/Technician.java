import java.util.*;

abstract class Employee {
    String name;
    double basicSalary, da, hra, it;

    Employee(String n, double b) {
        name = n;
        basicSalary = b;
        da = basicSalary * 0.7;
        hra = basicSalary * 0.3;
        it = basicSalary * 0.4;
    }

    abstract double grossSal();

}

class Manager extends Employee {
    double inc;

    Manager(String n, double b) {
        super(n, b);
    }

    double grossSal() {
        inc = basicSalary * 0.1;
        double gross = basicSalary + da + hra + it + inc;
        System.out.println("Employee name: " + name);
        System.out.println("Designation manager :");
        System.out.println("Basic of Employee : " + basicSalary);
        System.out.println("Da of Employee : " + da);
        System.out.println("hra of Employee : " + hra);
        System.out.println("it of employee  : " + it);
        System.out.println("annual increment of Employee : " + inc);
        return gross;
    }
}

public class Technician extends Employee {
    double inc;

    Technician(String n, double b) {
        super(n, b);
    }

    double grossSal() {
        inc = basicSalary * 0.15;
        double gross = basicSalary + da + hra + it + inc;
        System.out.println("Employee name : " + name);
        System.out.println("designation : technician");
        System.out.println("Basic of Employee : " + basicSalary);
        System.out.println("Da of Employee : " + da);
        System.out.println("hra of Employee : " + hra);
        System.out.println("it of employee  : " + it);
        System.out.println("annual increment of Employee : " + inc);
        return gross;
    }

    public static void main(String[] args) {
        Manager m = new Manager("anil", 4000);
        Technician t1 = new Technician("ram", 500);
        Technician t2 = new Technician("shyam", 1000);
        Technician t3 = new Technician("shiv", 1500);
        Technician t4 = new Technician("gopal", 1200);
        Employee e;
        e = m;
        System.out.println("Gross Salary " + e.grossSal());
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        e = t1;
        System.out.println("Gross Salary " + e.grossSal());
        System.out.println("=====================================================================");
        e = t2;
        System.out.println("Gross Salary " + e.grossSal());
        System.out.println("=====================================================================");
        e = t3;
        System.out.println("Gross Salary " + e.grossSal());
        System.out.println("=====================================================================");
        e = t4;
        System.out.println("Gross Salary " + e.grossSal());

    }
}
