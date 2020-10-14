import java.util.ArrayList;
import java.util.List;

public class University
{
    public String UniversityName;
    public int foundationYear;
    public List StudentsList = new ArrayList();


    public University(String n, int year, List students)
    {
        UniversityName = n;
        foundationYear = year;
        StudentsList = students;
    }


    public void Average()
    {
        float total = 0;
        float average = 0;
        Student StudentIter;
        System.out.println(this.UniversityName + " Students Marks:");

        for (Object o : StudentsList) {
            StudentIter = (Student) o;
            System.out.println(StudentIter.name + ": " + StudentIter.mark);
            total += StudentIter.mark;
        }

        average = total / StudentsList.size();
        System.out.println(this.UniversityName + " Students Average grade: " + average + "\n");
    }

}