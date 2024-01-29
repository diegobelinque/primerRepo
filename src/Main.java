import java.util.Date;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Subject subject1 = new Subject("Subject1");
        university.addSubject(subject1);
        Subject subject2 = new Subject("Subject2");
        university.addSubject(subject2);
        Subject subject3 = new Subject("Subject3");
        university.addSubject(subject3);

        Department department1 = new Department("Department1");
        university.addDepartment(department1);
        Department department2 = new Department("Department2");
        university.addDepartment(department2);
        Department department3 = new Department("Department3");
        university.addDepartment(department3);

        Section section1 = new Section("Section1");
        university.addSection(section1);
        Section section2 = new Section("Section2");
        university.addSection(section2);
        Section section3 = new Section("Section3");
        university.addSection(section3);


        for (int i = 1; i <= 5; i++) {
            Student student = new Student("Student" + i, "Surname" + i, "Single");
            // pick a random subject and add student to it
            Random random = new Random();
            int randomSubject = random.nextInt(university.getSubjects().size());
            university.getSubjects().get(randomSubject).addStudent(student);
            university.addStudent(student);

            Teacher teacher = new Teacher("Teacher" + i, "Surname" + i, "Single", "Office" + i, new Date());
            int randomDepartment = random.nextInt(university.getDepartments().size());
            university.getDepartments().get(randomDepartment).addTeacher(teacher);
            university.addTeacher(teacher);

            ServiceStaff serviceStaff = new ServiceStaff("ServiceStaff" + i, "Surname" + i, "Single", "Office" + i, new Date());
            int randomSection = random.nextInt(university.getSections().size());
            university.getSections().get(randomSection).addServiceStaff(serviceStaff);
            university.addServiceStaff(serviceStaff);
        }

        System.out.println("Students:");
        for (Student student : university.getStudents()) {
            System.out.println(student);
        }

        System.out.println("Teachers:");
        for (Teacher teacher : university.getTeachers()) {
            System.out.println(teacher);
        }

        System.out.println("ServiceStaffs:");
        for (ServiceStaff serviceStaff : university.getServiceStaffs()) {
            System.out.println(serviceStaff);
        }

        System.out.println("Teachers by department:");
        for (Teacher teacher : university.getTeachersByDepartment(department1)) {
            System.out.println(teacher);
        }

        System.out.println("Students by subject:");
        for (Student student : university.getStudentsBySubject(subject1)) {
            System.out.println(student);
        }

        // get a teacher department then change it and print again
        /*Teacher teacherTest = university.getTeachers().getFirst();
        System.out.println("Teacher department before change: " + teacherTest.getDepartment());
        teacherTest.setDepartment(department2);
        System.out.println("Teacher department after change: " + teacherTest.getDepartment());

        // get a student subjects then add one and print again
        Student studentTest = university.getStudents().getFirst();
        System.out.println("Student subject before change: " + studentTest.getSubjects());
        studentTest.addSubject(subject1);
        System.out.println("Student subject after change: " + studentTest.getSubjects());

        // get a serviceStaff department then change it and print again
        ServiceStaff serviceStaffTest = university.getServiceStaffs().get(2);
        System.out.println("ServiceStaff department before change: " + serviceStaffTest.getSection());
        serviceStaffTest.setSection(section3);
        System.out.println("ServiceStaff department after change: " + serviceStaffTest.getSection());*/
        

    }
}