package GradeBook;

public class GradeBook {
    private String courseName;
    private int[] grades;

    // Constructor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
        displayMsg();
    }

    // Getter ve setter metotları
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Mesajı görüntüleme metodu
    public void displayMsg() {
        System.out.println("Welcome to the Grade Book for " + courseName);
    }

    // Ortalama hesaplama metodu
    public void getAvg() {
        System.out.println("Average Grade is " + getTotal() / grades.length);
    }

    // Öğrenci notlarını gösterme metodu
    public void showStudent() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
    }

    // Toplam not hesaplama metodu
    public int getTotal() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    // En düşük notu bulma metodu
    public void getMin() {
        int minGrade = grades[0];
        for (int grade : grades) {
            if (grade < minGrade) {
                minGrade = grade;
            }
        }
        System.out.println("Minimum Grade is " + minGrade);
    }

    // En yüksek notu bulma metodu
    public void getMax() {
        int maxGrade = grades[0];
        for (int grade : grades) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        System.out.println("Maximum Grade is " + maxGrade);
    }
}
