import java.util.ArrayList;
import java.util.Date;

public class Person
{
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public Date birthDate;
    public String gender;
    public String homeAddress;
    public String phoneNumber;

    public ArrayList<Hospital> hospitals = new ArrayList<Hospital>();

    Person(String title, String givenName, String middleName, String familyName, Date birthDate, String gender, String homeAddress, String phone)
    {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNumber = phone;
    }

    Person(Person person)
    {
        this.title = person.title;
        this.givenName = person.givenName;
        this.middleName = person.middleName;
        this.familyName = person.familyName;
        this.birthDate = person.birthDate;
        this.gender = person.gender;
        this.homeAddress = person.homeAddress;
        this.phoneNumber = person.phoneNumber;
    }

    public String getFullName()
    {
        String FullName = this.givenName + " " + this.middleName + " " + this.familyName;
        return FullName;
    }

    public void setHospitals(ArrayList<Hospital> hspt)
    {
        this.hospitals = hspt;
    }

}
