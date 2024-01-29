import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Subject> subjects;
    public Student(String name, String surname, String civilStatus) {
        super(name, surname, civilStatus);
        this.subjects = new ArrayList<Subject>();
    }

    protected void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public void removeSubject(Subject subject){
        this.subjects.remove(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String toString(){
        return "Student: " + this.getName() + " " + this.getSurname() + " " + this.getId() + " " + this.getCivilStatus() + " " + this.getSubjects();
    }
}
