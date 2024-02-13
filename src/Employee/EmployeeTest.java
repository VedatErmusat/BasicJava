package Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee salObj = new SalariedEmployee("Vedat", "Ermuşat", "4123412", 750);
        HourlyEmployee HourObj = new HourlyEmployee("Eray", "Duruk", "1523454325", 55, 200);
        ComissionEmployee compObj = new ComissionEmployee("Ömer", "Furkan", "151614432", 3500, 0.25);
        BasePlusComEmployee baseObj= new BasePlusComEmployee("Arif", "Köken", "2345665", 2500, 0.15, 1500);

        Employee[] emp = {salObj,HourObj,compObj,baseObj};

        for (Employee employee : emp) {
            System.out.println(employee.earning());
        }
    }
}
