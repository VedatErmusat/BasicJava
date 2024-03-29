package İnheritance.Example2;

public class Employee {
    //protected Object showsInfo;
    private String name, department;
    private double salary;

    public void showsInfo() {
        System.out.println("Name: "+getName());
        System.out.println("Department: "+getDepartment());
        System.out.println("Salary: "+getSalary());
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department= department;
        this.salary= salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Class Name: " + getClass().getName();
    }
}
