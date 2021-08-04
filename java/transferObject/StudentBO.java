import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<StudentVO>();

        StudentVO s1 = new StudentVO("bob", 0);
        StudentVO s2 = new StudentVO("ally", 1);

        students.add(s1);
        students.add(s2);

    }

    public void deleteStudent(StudentVO student){
        students.remove(student.getRollNo());
        System.out.println("Student: " + student.getRollNo() + " deleted");
    }

    public List<StudentVO> getAllStudents(){
        return students;
    }
    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: " + student.getRollNo() + " updated");
    }
}
