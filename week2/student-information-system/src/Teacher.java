public class Teacher {
    String teacherName;
    String branch;
    String email;

    Teacher(String name, String email, String branch) {
        this.teacherName = name;
        this.email = email;
        this.branch = branch;
    }

    public void printInfoTeacher() {
        System.out.println("Teacher name: " + teacherName);
        System.out.println("Teacher branch: " + branch);
        System.out.println("Teacher email address: " + email);
    }

    public static void addTeacher(String nameNew, String branchNew, String emailNew) {
        System.out.println("Teacher name: " + nameNew);
        System.out.println("Teacher branch: " + branchNew);
        System.out.println("Teacher email address: " + emailNew);
    }
}
