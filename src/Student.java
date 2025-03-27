//DO NOT MODIFY THIS FILE!

public class Student {
    
    private String fName;
    private String lName;
    private double grade;

    public Student(String f, String l, int g){
        fName = f;
        lName = l;
        grade = g;
    }

    public String getFirstName(){
        return fName;
    }

    public String getLastName(){
        return lName;
    }

    public double getGrade(){
        return grade;
    }
}
