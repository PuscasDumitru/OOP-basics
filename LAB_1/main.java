
import java.util.Arrays;
import java.util.List;


public class main {

    public static void main(String[] args) {


        Student stud_1 = new Student("Nicolae", 21, 7.6f);
        Student stud_2 = new Student("Sebastian", 18, 8.9f);
        Student stud_3 = new Student("Ion", 19, 9.2f);
        Student stud_4 = new Student("Mihail", 22, 8.1f);
        Student stud_5 = new Student("Dumitru", 21, 6.6f);
        Student stud_6 = new Student("Victor", 18, 5.9f);

        List<Student> listStudentsULIM = Arrays.asList( stud_1,stud_2);
        List<Student> listStudentsUASM = Arrays.asList( stud_3,stud_4);
        List<Student> listStudentsASM = Arrays.asList( stud_5,stud_6);

        University ULIM = new University("ULIM", 1992, listStudentsULIM);
        University UASM = new University("UASM", 1933, listStudentsUASM);
        University ASM = new University("ASM", 1955, listStudentsASM);


        Student StudentExample;
        StudentExample = (Student) ULIM.StudentsList.get(1);
        StudentExample.ShowStudentInfo();

        ULIM.Average();
        UASM.Average();
        ASM.Average();

    }
}