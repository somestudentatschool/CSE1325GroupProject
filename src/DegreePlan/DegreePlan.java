package DegreePlan;

import java.io.*; //includes FileReader and BufferedReader

public class DegreePlan
{
    Degree degree; //This is the enum-Colby
    private int students;
    private String filename;
    public DegreePlan(Degree degree) {
        this.degree = degree;
    }

    public void getDegreePlan() /*This isn't finished yet. It's supposed to get the
                                      classes for the degrees using the enum- Colby*/
        {
            switch(degree)
            {
                case CSE:
                    filename = "CompSci.txt";
                    break;
                case BIOMED:
                    filename = "BEPlan.txt";
                    break;
                case MECHANICAL:
                    filename = "MEPlan.txt";
                    break;
            }
        }

        public void StudentMajors(int students)
        {
            this.students = students;
        }

        public int getStudents() {
            return students;
        }

        //since we are reading in files, I thought that maybe we should use a try-catch method to read in
        //the files, might be a tad bit buggy so let me know if I need to fix anything - Efaz
        public void readDegreePlans()
        {
            try
            {
                FileReader degreePlans = new FileReader(filename);
                BufferedReader someDegree = new BufferedReader(degreePlans);

                String line;
                while((line = someDegree.readLine()) != null)
                {

                }
                someDegree.close();
            }

            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}