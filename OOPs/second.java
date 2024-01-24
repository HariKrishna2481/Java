public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize name, jobTitle, and salary
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a certain percentage
    public void raiseSalary(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
        System.out.println(name + "'s salary raised by " + percentage + "%. New salary: $" + salary);
    }

    // Method to print employee information
    public void printEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee1 = new Employee("John Doe", "Software Engineer", 60000);

        // Print initial employee information
        employee1.printEmployeeInfo();

        // Raise salary by 10%
        employee1.raiseSalary(10);

        // Print updated employee information
        employee1.printEmployeeInfo();
    }
}
