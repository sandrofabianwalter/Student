package at.was.Student;

import java.util.ArrayList;

/**
 * Created by sandro.walter on 11.10.2016.
 */
public class StudentDaoImpl implements StudentDao{

    private ArrayList<Student> Studentlist = new ArrayList<Student>();

    public ArrayList<Student> getAllStudents()
    {
        return Studentlist;
    }
    public Student getStudent (int myStudent)
    {
        return Studentlist.get(getPosNr(myStudent));
    }
    public void updateStudent (int myStudent, String Name)
    {
        Studentlist.get(getPosNr(myStudent)).setName(Name);
    }
    public void deleteStudent (int myStudent)
    {
        Studentlist.remove(getPosNr(myStudent));
    }
    public void addStudent (Student myStudent)
    {
        Studentlist.add(myStudent);
    }
    public int getPosNr(int MatNr)
    {
        int j=0;
        int myMatNr=0;
        while (j < Studentlist.size())
        {
            if(Studentlist.get(j).getMatNr()==MatNr)
            {
                myMatNr=j;
            }
            j++;
        }
        return myMatNr;
    }
}
