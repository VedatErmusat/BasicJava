package İnheritance.Example2;

public class Manager extends Employee{
    private int numOfEmployee;

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public Manager(String name, String department, double salary, int numOfEmployee) {
        super(name, department, salary);
        setNumOfEmployee(numOfEmployee);
    }
    public void showsInfo(){
        super.showsInfo();
        System.out.println("Number of Employee: "+getNumOfEmployee());
    }

    @Override
    public String toString() {
        showsInfo();
        return super.toString();
    }
}
