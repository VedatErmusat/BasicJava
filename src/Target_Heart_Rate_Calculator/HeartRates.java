package Target_Heart_Rate_Calculator;

import java.time.Year;
import java.util.Scanner;

public class HeartRates {
        private String name,surname;
        private int dateOfDay,dateOfMont,dateOfYear;
        int currentYear=Year.now().getValue();
        public void setDateOfYear(int dateOfYear) {
            this.dateOfYear = dateOfYear;
        }

        public void setDateOfMont(int dateOfMont) {
            this.dateOfMont = dateOfMont;
        }

        public void setDateOfDay(int dateOfDay) {
            this.dateOfDay = dateOfDay;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getDateOfDay() {
            return dateOfDay;
        }

        public int getDateOfMont() {
            return dateOfMont;
        }

        public int getDateOfYear() {
            return dateOfYear;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
        public HeartRates(String name,String surname,int dateOfDay,int dateOfMont,int dateOfYear){
            this.name=name;
            this.surname=surname;
            this.dateOfDay=dateOfDay;
            this.dateOfMont=dateOfMont;
            this.dateOfYear=dateOfYear;
        }
        public HeartRates(){

        }
        public int personAge(){
            return currentYear-getDateOfYear();
        }
        public int maxHeartRate(){
            return 220-personAge();
        }
        public void targetHeartRate(){

            System.out.println("Average heart rate is between "+((maxHeartRate()*50)/100)+" - "+((maxHeartRate()*85)/100));

        }
        public void displayToScreen() {
            System.out.printf("Name = %s%nSurname = %s%nDate of birth = %d,%d,%d%nAge = %d%n", getName(), getSurname(), getDateOfDay(), getDateOfMont(), getDateOfYear(), personAge());
            targetHeartRate();
        }
        public static void main(String[] args) {
            Scanner rs = new Scanner(System.in);
            String name,surname;
            int day,month,year;
            System.out.println("Adınızı Giriniz: ");
            name=rs.nextLine();
            System.out.println("Soyadınızı Giriniz: ");
            surname=rs.nextLine();
            System.out.println("Doğum Tarihinizin Gününü Giriniz: ");
            day=rs.nextInt();
            System.out.println("Doğum Tarihinizin Ayını Giriniz (Rakamla): ");
            month=rs.nextInt();
            System.out.println("Doğum Tarihinizin Yılını Giriniz: ");
            year=rs.nextInt();
            HeartRates hrt =new HeartRates(name,surname,day,month,year);
            hrt.displayToScreen();
        }
}
