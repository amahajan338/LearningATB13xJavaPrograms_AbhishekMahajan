package Task_of_July.ex_3_july_task.Method_Overriding;

public class Employee_Role_Info {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.role();

        Manager m1 = new Manager();
        m1.role();

        Clerk c1 = new Clerk();
        c1.role();

        Tester t1 = new Tester();
        t1.role();

        //Dynamic method dispatch
        Employee a1 = new Manager();
        a1.role();
    }
}

class Employee {
    void role() {
        System.out.println("General Employee!");
    }
}

class Manager extends Employee {
    @Override
    void role(){
        System.out.println("Manager role!");
    }
}

class Clerk extends Employee {
    @Override
    void role() {
        System.out.println("Clerk role!");
    }
}

class Tester extends Employee {
    @Override
    void role() {
        System.out.println("Tester role!");
    }
}
