package DegreePlan;


public class DegreePlan
{
    /*Was thinking we could use an enum and get information using it,
    like if we need to get how many students are enrolled in classes
    and in a specific major.*/
    public enum Degree
    {
        Computer_Science(1),
        Nursing(2),
        Mechanical(1),
        Accounting(3),
        Chemistry(4);
        private int students;

        void StudentMajors(int students)
        {
            this.students = students;
        }

        public int getStudents()
        {
            return students;
        }
    }
}