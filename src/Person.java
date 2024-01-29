public class Person {
    private String name;
    private String surname;
    private int id;
    private String civilStatus;

    public Person(String name, String surname, String civilStatus) {
        this.name = name;
        this.surname = surname;
        this.civilStatus = civilStatus;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getCivilStatus() {
        return civilStatus;
    }


    public void setCivilStatus(String civilStatus) {
        this.civilStatus=civilStatus;
    }

    protected void setId(int id) {
        this.id=id;
    }
}
