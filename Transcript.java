package assn1.syt;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Transcript{
    public List<Grade> grades = new ArrayList();
    private final int IDNUMBER;

    public Transcript(int IDNUMBER) {
        this.IDNUMBER = IDNUMBER;
    }

    public void addGrade(Grade newGrade){
        grades.add(newGrade);
    }

    public void removeByCName(String courseNameRemove){
        for(int i=0;i<grades.size();i++){
            if(grades.get(i).getCourseName().equals(courseNameRemove)){
                grades.remove(i);
            }
        }
    }

    public void removeByCNameAndLetter(String courseNameRemove, String letterGradeRemove){
        for(int i=0;i<grades.size();i++){
            if(grades.get(i).getCourseName().equals(courseNameRemove) && grades.get(i).getLetterGrade().equals(letterGradeRemove)){
                grades.remove(i);
            }
        }
    }

    @Override
    public String toString(){
        return "Student " +  IDNUMBER + ": GPA " +  this.printTranscript();
    }
    /**
     * This method formats the numbers and rounds them accordingly
     * @return the final list of all the grades along with the final GPA
     */
    public String printTranscript(){
        NumberFormat formatter=NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(2);
            formatter.setMinimumFractionDigits(2);

        String temp = "";
        if(grades.isEmpty()){
            temp= "NaN";
        }
        else{
            temp = formatter.format(Registrar.getGPA(grades));
            for(int i=0;i<grades.size();i++){
                temp += grades.get(i).toString();
            }
        }
        return temp;
    }
}