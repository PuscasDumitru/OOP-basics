import java.util.ArrayList;

public class Hospital
{
    public String name;
    public String Address;
    public String phone;

    public ArrayList<Person> persons = new ArrayList<Person>();
    public ArrayList<Department> departments = new ArrayList<Department>();

    public Hospital(String name, String Address, String phone)
    {
        this.name = name;
        this.Address = Address;
        this.phone = phone;
    }

    public void getPersons(ArrayList<Person> prsn)
    {
        this.persons = prsn;
    }

    public void getDepartments(ArrayList<Department> dprt)
    {
        this.departments = dprt;
    }

}
