import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Date;

public class Student {
    private HashMap<Integer, String> grades = new HashMap<>();
    public static List<Student> students = new ArrayList<>();
    private String imie;
    private String surname;
    private String email;
    private String adres;
    private String phoneNumber;
    private Date date;
    private StudyProgramme studyProgramme;
    private int currentSemester = 1;
    private int numberOfStudent;
    private String indexNumber;
    private String status = "Student";

    public Student(String imie, String surname, String email, String adres, String phoneNumber, Date date) {
        this.imie = imie;
        this.surname = surname;
        this.email = email;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
        this.date = new Date();
        this.indexNumber = "s" + numberOfStudent;
        numberOfStudent++;
        students.add(this);
    }

    public void addGrade(int mark, String subject) {
        this.grades.put(mark, subject);
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public void promoteToTheNextSemester() {
        if (currentSemester < studyProgramme.getCountOfSemesters()) {
            currentSemester++;
        } else {
            status = "Graduated";
        }
    }
    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("------------------------------------------");
            System.out.println("Imię: " + student.imie);
            System.out.println("Nazwisko: " + student.surname);
            System.out.println("Email: " + student.email);
            System.out.println("Adres: " + student.adres);
            System.out.println("Numer telefonu: " + student.phoneNumber);
            System.out.println("Numer S: " + student.indexNumber);
            System.out.println("Status: " + student.status);
            System.out.println("Current Semester: " + student.currentSemester);
            System.out.println();
        }
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToTheNextSemester();
        }
    }
}