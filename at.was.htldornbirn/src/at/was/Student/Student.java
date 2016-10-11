package at.was.Student;

/**
 * Created by sandro.walter on 11.10.2016.
 */
public class Student {
    private String name;
    private int matNr;

    public Student(String name, int matNr) {
        this.name = name;
        this.matNr = matNr;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }
}
