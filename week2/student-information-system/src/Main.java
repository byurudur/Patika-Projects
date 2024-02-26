public class Main {
    public static void main(String[] args) {

        // Enter teacher information, creating "teacher" objects;
        Teacher teacherInfoMath = new Teacher("Furkan Aydemir", "furkanaydemir@schoolmail.com", "Math");
        Teacher teacherInfoPhysics = new Teacher("Batuhan Yürüdür", "batuhanyurudur@gmail.com", "Physics");
        Teacher teacherInfoHistory = new Teacher("Semih Turan", "semihturanmail", "History");

        System.out.println("_______________________________________");

        // Enter course information, creating "course" objects.
        Course math = new Course("Math", "MAT");
        Course physics = new Course("Physics", "PHY");
        Course history = new Course("History", "HIS");

        System.out.println("_______________________________________");

        //
        math.teacherInfo(teacherInfoMath);
        System.out.println("____");
        physics.teacherInfo(teacherInfoPhysics);
        System.out.println("____");
        history.teacherInfo(teacherInfoHistory);

        System.out.println("_______________________________________");


        Student student = new Student("Java 101", "b11000022", 60, 85, 80, 35, 25, 75 );
        student.averageGrade();
    }
}