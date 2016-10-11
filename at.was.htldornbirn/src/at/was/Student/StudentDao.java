package at.was.Student;

import java.util.ArrayList;

/**
 * Created by sandro.walter on 11.10.2016.
 */
public interface StudentDao {
    public ArrayList<Student> getAllStudents();
    public Student getStudent (int myStudent);
    public void updateStudent (int myStudent, String Name);
    public void deleteStudent (int myStudent);
    public void addStudent (Student myStudent);
}
