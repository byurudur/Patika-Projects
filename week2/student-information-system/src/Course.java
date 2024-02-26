import java.util.Objects;

public class Course {
    String courseName;
    Teacher teachers;
    double average;
    String prefix;

    Course(String courseName, String prefix){
        this.courseName = courseName;
        this.prefix = prefix;
    }

    public void teacherInfo(Teacher teachers){
        if (this.courseName.equals(teachers.branch)){
            System.out.println("Teacher has been selected.");
            System.out.println("Class: " + teachers.branch );
        }else {
            System.out.println("Teacher has not been selected.");
        }
    }
}
