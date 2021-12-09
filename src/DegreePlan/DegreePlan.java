package DegreePlan;

import java.io.*; //includes FileReader and BufferedReader
import java.util.Scanner;

public class DegreePlan
{
    Degree degree; //This is the enum-Colby
    private int students;
    private static String filename;

    //testing to see why it keeps getting null errors
    String[] classNum = new String[10];
    String[] hours = new String[10];
    String[] nameOfClass = new String[10];
    String[] description = new String[10];
    //String[] classNum, hours, nameOfClass, description;

    public DegreePlan(Degree degree) {
        this.degree = degree;
    }

    public void getDegreePlan() /*This isn't finished yet. It's supposed to get the
                                      classes for the degrees using the enum- Colby*/
        {
            switch(degree)
            {
                case CSE:
                    filename = "CSPlan.txt";
                    break;
                case BIOMED:
                    filename = "BEPlan.txt";
                    break;
                case MECHANICAL:
                    filename = "MEPlan.txt";
                    break;
            }
        }
        public String[] getLists()
        {
            return classNum;
        }

        public String[] getHours()
        {
            return hours;
        }

        public String[] getName()
        {
            return nameOfClass;
        }

        public String[] getDescription()
    {
        return description;
    }

        //since we are reading in files, I thought that maybe we should use a try-catch method to read in
        //the files, might be a tad bit buggy so let me know if I need to fix anything - Efaz
        public void readDegreePlans()
        {
            System.out.println("Filename: "+filename);
            int count = 0;
            try
            {
                FileReader degreePlans = new FileReader("src/DegreePlan/"+filename);
                BufferedReader someDegree = new BufferedReader(degreePlans);

                String line;
                while((line = someDegree.readLine()) != null)
                {
                    //line = someDegree.readLine();
                    String[] parsedInfo = line.split("~");
                    classNum[count] =  parsedInfo[0];
                    hours[count] = parsedInfo[1];
                    nameOfClass[count] = parsedInfo[2];
                    description[count] = parsedInfo[3];
                    System.out.println("ClassNum = "+classNum[count]+"\nhours = "+hours[count]+"\nnameOfClass = "+nameOfClass[count]+"\ndescription = "+description[count]);
                    count++;
                }
                someDegree.close();
            }

            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}