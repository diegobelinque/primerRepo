import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Teacher> teachers;

    public Department(String name){
        this.name = name;
        this.teachers = new ArrayList<Teacher>();
    }

    public void addTeacher(Teacher teacher){
        if (this.teachers.contains(teacher)){
            return;
        }
        this.teachers.add(teacher);
        teacher.setDepartment(this);
    }

    public void removeTeacher(Teacher teacher){
        if (!this.teachers.contains(teacher)){
            return;
        }
        this.teachers.remove(teacher);
        teacher.setDepartment(null);
    }

    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getName();
    }
}
