import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;

public class Transcript{
    public List<Grade> grades = new ArrayList();
    final int IDNumber;

    public Transcript(int IDNumber) {
        this.IDNumber = IDNumber;
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

    public String toString(){
        return "Student " +  IDNumber + ": GPA " +  this.printTranscript();
    }

    public String printTranscript(){
        NumberFormat formatter=
			NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(1);
            formatter.setMinimumFractionDigits(1);
            NumberFormat defaultFormat = NumberFormat.getInstance();

        String temp = "";
        if(grades.isEmpty()){
            temp= "NaN";
        }
        else{
            temp = ""+ defaultFormat.format(Registrar.getGPA(grades));
            for(int i=0;i<grades.size();i++){
                temp += grades.get(i).toString();
            }
        }
        return temp;
    }
}