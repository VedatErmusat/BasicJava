package Employee;

public class HourlyEmployee extends Employee{
    private double wage,hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyEmployee(String name, String lastName, String sSN,double wage,double hours) {
        super(name, lastName, sSN);
        setHours(hours);
        setWage(wage);
    }

    @Override
    public double earning() {
        return hours>=40?wage*hours:40*wage;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getWage()+"\n"+getHours();
    }
}
