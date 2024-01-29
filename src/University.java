import java.util.ArrayList;

public class University {
    private int personCount = 0;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<ServiceStaff> serviceStaffs;
    private ArrayList<Department> departments;
    private ArrayList<Subject> subjects;
    private ArrayList<Section> sections;

    public University(){
        this.teachers = new ArrayList<Teacher>();
        this.students = new ArrayList<Student>();
        this.serviceStaffs = new ArrayList<ServiceStaff>();
        this.departments = new ArrayList<Department>();
        this.subjects = new ArrayList<Subject>();
        this.sections = new ArrayList<Section>();
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
        teacher.setId(++personCount);
    }

    public void addStudent(Student student){
        this.students.add(student);
        student.setId(++personCount);
    }

    public void addServiceStaff(ServiceStaff serviceStaff){
        this.serviceStaffs.add(serviceStaff);
        serviceStaff.setId(++personCount);
    }

    public void addDepartment(Department department){
        this.departments.add(department);
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public void addSection(Section section){
        this.sections.add(section);
    }

    public void removeDepartment(Department department){
        this.departments.remove(department);
    }

    public void removeSubject(Subject subject){
        this.subjects.remove(subject);
    }

    public void removeSection(Section section){
        this.sections.remove(section);
    }

    public void removeTeacher(Teacher teacher){
        this.teachers.remove(teacher);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

    public void removeServiceStaff(ServiceStaff serviceStaff){
        this.serviceStaffs.remove(serviceStaff);
    }

    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public ArrayList<ServiceStaff> getServiceStaffs(){
        return this.serviceStaffs;
    }

    public ArrayList<Teacher> getTeachersByDepartment(Department department){
       return department.getTeachers();
    }

    public ArrayList<Student> getStudentsBySubject(Subject subject){
        return subject.getStudents();
    }

    public ArrayList<Department> getDepartments(){
        return this.departments;
    }

    public ArrayList<Subject> getSubjects(){
        return this.subjects;
    }

    public ArrayList<Section> getSections(){
        return this.sections;
    }


}
