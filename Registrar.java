import java.util.List;

public class Registrar{
    
    public static double getGPA(List<Grade> grades){
        double totalch = 0;
        double totalgp = 0;

        for (int i = 0; i<grades.size(); i++){
            double tempch = grades.get(i).getCreditNum();
            // changed
            double ch = (tempch - '0');
            totalch += ch;
            totalgp += (grades.get(i).getGradePoint())*ch;
        }
        return totalgp/totalch;
    }
}