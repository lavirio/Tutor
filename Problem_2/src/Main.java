import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student anton = new Aspirant("Anton", "Chekhov", "101B");
        Student ivan = new Student("Ivan", "Petrov", "303A");
        Aspirant igor = new Aspirant("Igor", "Tikhonov", "405C");
        Student pasha = new Student("Pasha", "Osipov", "204C");
        Student john = new Aspirant("John", "Thompson", "501A");
        anton.setAverageMark(3.8);
        igor.setAverageMark(5);
        ivan.setAverageMark(5);
        pasha.setAverageMark(4.2);
        Student[] students = {igor, anton, ivan, pasha};

        System.out.println("Grades:");
        Arrays.stream(students).forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName() + " has a scholarship of " + student.getScholarship() + " grn"));

        System.out.println();
        john.setAverageMark(6);
        System.out.println(john.getFirstName() + " " + john.getLastName() + " has a scholarship of " + john.getScholarship() + " grn");


    }
}
