package Employee;

public class BasePlusComEmployee extends ComissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary>0?baseSalary:0;
    }

    public BasePlusComEmployee(String name, String lastName, String sSN, double grossSale, double commissionRate, double baseSalary) {
        super(name, lastName, sSN, grossSale, commissionRate);
        setBaseSalary(baseSalary);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getBaseSalary();
    }
}
