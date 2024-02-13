package İnheritance.Example2;

public class Test {
    public static void main(String[] args) {
        Employee empObj = new Employee("Muhammed","Sofware",1400);
        Manager managerObj = new Manager("Ali","Computer",1500, 2);

        System.out.println(empObj);
        empObj.showsInfo();
        System.out.println();
        System.out.println(managerObj);
        //managerObj.showsInfo();

    }
}
