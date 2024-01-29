import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private ArrayList<Student> students;

    public Subject(String name){
        this.name = name;
        this.students = new ArrayList<Student>();
    }


    public void addStudent(Student student){
        if (this.students.contains(student)){
            return;
        }
        this.students.add(student);
        student.addSubject(this);
    }

    public void removeStudent(Student student){
        if (!this.students.contains(student)){
            return;
        }
        this.students.remove(student);
        student.removeSubject(this);
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getName();
    }
}
