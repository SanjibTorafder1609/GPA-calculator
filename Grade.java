package assn1.syt;
public class Grade{
    private String courseName;
    private double gradePoint;
    private String creditHour;
    private double creditNum;
    private String letterGrade;
    /**
     * This constructor takes one version of an input which consists of the course name the credi hours and the gradepoint
     *  and calculates the letter grade to make it easier to calculate later.
     * @param courseName the name of the course
     * @param creditHour the credit hours of the course
     * @param gradePoint the grade point of the course
     */
    public Grade(String courseName, String creditHour, double gradePoint){
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.creditNum = creditHour.charAt(0);      //Since our format for the credit hours is "4CH" the "4" will be stored as a char and later converted to double
        this.gradePoint = gradePoint;
        this.letterGrade = calculateLetterGrade(gradePoint);

    }
    /**
     * This constructor takes one version of an input which consists of the course name the credi hours and the letter grade
     * and calculates the point grade to make it easier to calculate later.
     * @param courseName the name of the course
     * @param creditHour the credit hours of the course
     * @param letterGrade the letter grade achieved in the course
     */
    public Grade(String courseName, String creditHour, String letterGrade){
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.creditNum = creditHour.charAt(0);      //Since our format for the credit hours is "4CH" the "4" will be stored as a char and later converted to double
        this.letterGrade = letterGrade;
        this.gradePoint = calculateGradePoint(letterGrade);
    }

    public String getCourseName(){
        return courseName;
    }

    public String getLetterGrade(){
        return letterGrade;
    }

    public double getCreditNum(){
        return creditNum;
    }

    public double getGradePoint(){
        return gradePoint;
    }

    public String getCreditHour(){
        return creditHour;
    }

    public double calculateGradePoint(String letterGrade){
        double temp=0;
        switch (letterGrade){
            case "A+":
                temp = 4.3;
                break;
            
            case "A":
                 temp = 4.0;
                 break;

            case "A-":
                 temp = 3.7;
                 break;
        
            case "B+":
                 temp = 3.3;
                 break;

            case "B":
                 temp = 3.0;
                 break;

            case "B-":
                 temp = 2.7;
                 break;

            case "C+":
                 temp = 2.3;
                 break;
            
            case "C":
                 temp = 2.0;
                 break;
                 
            case "D":
                 temp = 1.0;
                 break;
                 
            case "F":
                 temp = 0.0;
                 break;
                 
        }
        return temp;
    }

    public String calculateLetterGrade(double gradePoint){
        if(gradePoint == 4.3){
            return "A+";
        }
        else if (gradePoint == 4.0) {
            return "A";
        } 
        else if (gradePoint == 3.7) {
            return "A-";
        } 
        else if (gradePoint == 3.3) {
            return "B+";
        } 
        else if (gradePoint == 3.0) {
            return "B";
        } 
        else if (gradePoint == 2.7) {
            return "B-";
        } 
        else if (gradePoint == 2.3) {
            return "C+";
        } 
        else if (gradePoint == 2.0) {
            return "C";
        } 
        else if (gradePoint == 1.0) {
            return "D";
        } 
        else if (gradePoint == 0.0) {
            return "F";
        } 
        else{
            return "";
        }
    }

    @Override
    public String toString(){
        return "\n" + this.getCourseName() + " " + this.getCreditHour() + " " + this.getGradePoint() + " (" + this.getLetterGrade()+")";
    }
}