package assn1.syt;
import java.util.List;

public class Registrar{
    
    public static double getGPA(List<Grade> grades){
        double totalch = 0;
        double totalgp = 0;
        
        for (int i = 0; i<grades.size(); i++){
            double tempCreditNum = grades.get(i).getCreditNum();   //creditNum is stored as a ch therefore changing to a double
            double finalCreditNum = (tempCreditNum - '0');     //after conversion the double is 52 therefore subtracting 48 (char '0')
            totalch += finalCreditNum;
            totalgp += (grades.get(i).getGradePoint())*finalCreditNum;
        }
        return totalgp/totalch;
    }
}