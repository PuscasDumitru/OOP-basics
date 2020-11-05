import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person
{
    public String id;
    public int age;
    public Date accepted;
    public String[] sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;
    public ArrayList<OperationsStaff> surgStaff = new ArrayList<OperationsStaff>();

    Patient(Person person, String id, int age,Date accepted, String[] history, String[] prescriptions, String[] allergies,
            String[] specialReqs)
    {
        super(person);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickness = history;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public void getStaff(ArrayList<OperationsStaff> st)
    {
        this.surgStaff = st;
    }

}
