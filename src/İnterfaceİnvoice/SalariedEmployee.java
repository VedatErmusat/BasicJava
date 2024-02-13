package İnterfaceİnvoice;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary>0?weeklySalary:0;
    }

    public SalariedEmployee(String name, String lastName, String sSN, double weeklySalary) {
        super(name, lastName, sSN);
        setWeeklySalary(weeklySalary);
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWeekly Salary: "+getWeeklySalary();
    }
}
