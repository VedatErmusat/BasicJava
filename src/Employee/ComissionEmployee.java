package Employee;

public class ComissionEmployee extends Employee{
    private double grossSale,commissionRate;

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public ComissionEmployee(String name, String lastName, String sSN,double grossSale,double commissionRate) {
        super(name, lastName, sSN);
        setCommissionRate(commissionRate);
        setGrossSale(grossSale);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double earning() {
        return getCommissionRate()*getGrossSale();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getCommissionRate()+"\n"+getGrossSale();
    }
}
