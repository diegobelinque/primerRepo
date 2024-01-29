import java.util.ArrayList;
import java.util.List;

public class Section {
    private String name;
    private ArrayList<ServiceStaff> serviceStaff;

    public Section(String name){
        this.name = name;
        this.serviceStaff = new ArrayList<ServiceStaff>();
    }

    public void addServiceStaff(ServiceStaff serviceStaff){
        if (this.serviceStaff.contains(serviceStaff)){
            return;
        }
        this.serviceStaff.add(serviceStaff);
        serviceStaff.setSection(this);
    }

    public void removeServiceStaff(ServiceStaff serviceStaff){
        if (!this.serviceStaff.contains(serviceStaff)){
            return;
        }
        this.serviceStaff.remove(serviceStaff);
        serviceStaff.setSection(null);
    }

    public ArrayList<ServiceStaff> getServiceStaff(){
        return this.serviceStaff;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getName();
    }
}
