import java.util.ArrayList;

public class Department
{
    public Hospital hospital;
    public ArrayList<Staff> staff = new ArrayList<Staff>();

    Department(Hospital hospital)
    {
        this.hospital = hospital;
    }

    public void getStaff(ArrayList<Staff> stf)
    {
        this.staff = stf;
    }
}
