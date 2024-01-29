import java.util.Date;

public class Employee extends Person{
    private Date incorporationDate;
    private String officeNumber;


    public Employee(String name, String surname, String civilStatus, String officeNumber, Date incorporationDate) {
        super(name, surname, civilStatus);
        this.officeNumber = officeNumber;
        this.incorporationDate = incorporationDate;
    }

    public Date getIncorporationDate() {
        return incorporationDate;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber=officeNumber;
    }
}
