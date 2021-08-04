import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
    // List is working as a database;
    List<Student> students;

    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("robert", 0);
        Student student2 = new Student("bob", 0);

        students.add(student1);
        students.add(student2);

    }
    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll NO " + student.getRollNo() + "deleted");
    }


    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public Student getStudent(int rollNo){
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll NO " + student.getRollNo() + "updated");
    }
}

