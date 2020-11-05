import java.util.Date;

public class Staff extends Person
{
    public Date joined;
    public String[] education;
    public String[] certification;
    public String[] languages;
    public Department department;
    Staff(Person person, Date joined, String[] education, String[] certification, String[] languages)
    {
        super(person);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    Staff(Person person , Staff staff) {
        super(person);
        this.joined = staff.joined;
        this.education = staff.education;
        this.certification = staff.certification;
        this.languages = staff.languages;
        this.department = staff.department;
    }

}
