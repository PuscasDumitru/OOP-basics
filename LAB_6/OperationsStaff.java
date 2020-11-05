import java.util.ArrayList;

public class OperationsStaff extends Staff
{
    ArrayList<Patient> patients = new ArrayList<Patient>();
   OperationsStaff(Person person, Staff staff)
   {
       super(person, staff);
   }

    OperationsStaff(Person person, Staff staff, ArrayList<Patient> patients)
    {
        super(person, staff);
        this.patients = patients;
    }

    public void getPatients(ArrayList<Patient> ptnt)
    {
        this.patients = ptnt;
    }
}
