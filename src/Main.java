import java.util.ArrayList;
import java.util.Date;

public class Main {
    int numberOfStudent = 0;

    public static void main(String[] args) {


        Student s =new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
        Student s2 =new Student("Timur", "Takhtashov", "s30442@wp.pl", "Warsaw, Zlota 235", "431-343-321", new Date(2006, 8, 28));

        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);

        s.enrollStudent(it);
        s2.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        s2.promoteToTheNextSemester();


        Student.promoteAllStudents();

        Student.displayInfoAboutAllStudents();


    }
}