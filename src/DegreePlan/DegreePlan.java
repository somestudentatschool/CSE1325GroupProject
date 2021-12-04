package DegreePlan;


public class DegreePlan
{
    Degree degree; //This is the enum-Colby
    private int students;
    /*Was thinking we could use an enum and get information using it,
    like if we need to get how many students are enrolled in classes
    and in a specific major.*/

    //I'm putting the enum into a different class. Leaving the original commented out.- Colby

    /*public enum Degree {
        Computer_Science(1),
        Nursing(2),
        Mechanical(1),
        Accounting(3),
        Chemistry(4);
    }*/
        public DegreePlan(Degree degree)
        {
            this.degree = degree;
        }

        public void getDegreePlan() /*This isn't finished yet. It's supposed to get the
                                      classes for the degrees using the enum- Colby*/
        {
            switch(degree)
            {
                case CSE:
                    break;
                case NURSING:
                    break;
                case MECHANICAL:
                    break;
                case CHEMISTRY:
                    break;
                case ACCOUNTING:
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
}