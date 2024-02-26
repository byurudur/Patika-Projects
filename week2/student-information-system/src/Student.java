public class Student {
        String studentName;
        String studentId;
        double phyGrade, phyGradeP, mathGrade, mathGradeP, historyGrade, historyGradeP, mathAverage, physicsAverage, historyAverage;
        int passingGrade = 60;

        Student(String studentName, String studentId, int phyGrade, int phyGradeP, int mathGrade, int mathGradeP,
                                    int historyGrade, int historyGradeP){

            this.studentName = studentName;
            this.studentId = studentId;
            this.phyGrade = phyGrade;
            this.phyGradeP = phyGradeP;
            this.mathGrade = mathGrade;
            this.mathGradeP = mathGradeP;
            this.historyGrade = historyGrade;
            this.historyGradeP = historyGradeP;

        }

        public void averageGrade(){
            boolean isPassMath =  ((mathGrade * 0.80) + (mathGradeP * 0.20)) > 60;
            boolean isPassPhysics = ((phyGrade * 0.80) + (phyGradeP * 0.20)) > 60;
            boolean isPassHistory =  ((historyGrade * 0.80) + (historyGradeP * 0.20)) > 60;

            System.out.println("Student name: " + studentName);
            System.out.println("Student ID: " + studentId);


           if (!isPassMath){
               System.out.println("You have failed the Math class");
           }else {
               System.out.println("You have passed the Math class with the average of " + (mathGrade * 0.80) + (mathGradeP * 0.20));
           }

           if (!isPassPhysics){
               System.out.println("You have failed the Physics class");
           }else {
               System.out.println("You have passed the Physics class with the average of " + (phyGrade * 0.80) + (phyGradeP * 0.20));
           }
           if (!isPassHistory){
               System.out.println("You have failed the History class");
           }else {
               System.out.println("You have passed the History class with the average of " + (historyGrade * 0.80) + (historyGradeP * 0.20));
           }

        }
}
