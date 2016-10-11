package at.was.Student;

/**
 * Created by sandro.walter on 11.10.2016.
 */
public class DaoPatternDemo {
    public static void main(String[] args){

        Student S1 = new Student("Peter",2056173);
        Student S2 = new Student("Mark",3015826);
        Student S3 = new Student("Jana",30234698);
        Student S4 = new Student("Kathi",1234567);

        StudentDaoImpl Studentlist = new StudentDaoImpl();
        Studentlist.addStudent(S1);
        Studentlist.addStudent(S2);
        Studentlist.addStudent(S3);
        Studentlist.addStudent(S4);

        System.out.println(Studentlist.getStudent(3015826).getName());


    }
}
