package Employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String name, String lastName, String sSN, double weeklySalary) {
        super(name, lastName, sSN);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double earning() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getWeeklySalary();
    }
}
