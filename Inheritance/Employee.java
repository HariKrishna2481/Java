
class Employee {

    void work() {
        System.out.println("Employee is working");
    }


    double getSalary() {

        return 0.0;
    }
}

class HRManager extends Employee {

    @Override
    void work() {
        System.out.println("HR Manager is working");
    }


    void addEmployee() {
        System.out.println("HR Manager is adding an employee");
    }
}


public class Main {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        double salary = hrManager.getSalary();
        System.out.println("Salary: " + salary);
        hrManager.addEmployee();
    }
}
