import java.util.Date;
public class Teacher extends Employee{

    private Department department;

    public Teacher(String name, String surname, String civilStatus, String officeNumber, Date incorporationDate) {
        super(name, surname, civilStatus, officeNumber, incorporationDate);
    }

    public Department getDepartment() {
        return department;
    }

    protected void setDepartment(Department department) {
        this.department=department;
    }

    public String toString(){
        return "Teacher: " + this.getName() + " " + this.getSurname() + " " + this.getId() + " " + this.getCivilStatus() + " " + this.getOfficeNumber() + " " + this.getIncorporationDate() + " " + this.getDepartment();
    }
}
