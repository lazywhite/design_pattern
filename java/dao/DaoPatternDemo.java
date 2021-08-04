public class DaoPatternDemo{
    public static void main(String[] args){
        StudentDao studentDao = new StudentDaoImpl();

        for(Student student: studentDao.getAllStudents()){
            System.out.println(student);

        }

        Student student1 = studentDao.getAllStudents().get(0);
        student1.setName("marry");
        studentDao.updateStudent(student1);

        student1 = studentDao.getStudent(0);
        System.out.println(student1);
    }
}
