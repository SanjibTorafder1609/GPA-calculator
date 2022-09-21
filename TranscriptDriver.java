public class TranscriptDriver{
    public static void main(String[] args) {

        Transcript t1 = new Transcript(8510804);
        Grade g1 = new Grade("CS1003", "4CH", "A");
        Grade g2 = new Grade("CS2003", "4CH", "B+");
        Grade g3 = new Grade("ECE2213", "4CH", 3.3);
        Grade g4 = new Grade("ECON1101", "3CH", 4.0);
        Grade g5 = new Grade("CS2033", "4CH", "C+");

        t1.addGrade(g1);
        t1.addGrade(g2);
        t1.addGrade(g3);
        t1.addGrade(g4);
        t1.addGrade(g5);

        System.out.println(t1);

        System.out.println("\n");

        t1.removeByCNameAndLetter("CS2033","C+");
        System.out.println(t1);
        System.out.println("\n");

        t1.addGrade(g5);
        System.out.println(t1);
        System.out.println("\n");

        t1.removeByCName("CS2033");
        System.out.println(t1);
        System.out.println("\n");

        Transcript t2 = new Transcript(8510805);
        System.out.println(t2);
    }
}