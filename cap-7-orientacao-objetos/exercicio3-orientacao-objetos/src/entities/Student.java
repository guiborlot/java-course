package entities;

public class Student {
    public String name;
    public float grade1;
    public float grade2;
    public float grade3;

    public float finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public boolean passOrNot(){
        return (finalGrade() > 60) ? true : false;
    }

    public String toString(){
        if(passOrNot()){
            return "FINAL GRADE = "
                    + String.format("%.2f%n", finalGrade())
                    + "PASS";
        } else {
            return "FINAL GRADE = "
                    + String.format("%.2f%n", finalGrade())
                    + "FAILED\n"
                    + "MISSING "
                    + (60 - finalGrade())
                    + " POINTS";

        }

    }

}
