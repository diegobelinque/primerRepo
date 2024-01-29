import java.util.Date;
public class ServiceStaff extends Employee{

    private Section section;

    public ServiceStaff(String name, String surname, String civilStatus, String officeNumber, Date incorporationDate) {
        super(name, surname, civilStatus, officeNumber, incorporationDate);
    }

    public Section getSection() {
        return section;
    }

    protected void setSection(Section section) {
        this.section = section;
    }

    public String toString(){
        return "ServiceStaff: " + this.getName() + " " + this.getSurname() + " " + this.getId() + " " + this.getCivilStatus() + " " + this.getOfficeNumber() + " " + this.getIncorporationDate() + " " + this.getSection();
    }
}
