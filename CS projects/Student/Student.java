public class Student{
    private double GPA;   //I made these variables private.
    private int attendance;
    private boolean honorStatus;

    public Student(double d, int i, boolean b){
        GPA = d;
        attendance = i;
        honorStatus = b;
    }

    public boolean isEligibleForAward(){
        if (GPA >= 3.7 || honorStatus && attendance >= 90){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Student student1 = new Student(3.7, 95, false);
        Student student2 = new Student(3.5, 85, true);
        Student student3 = new Student(3.2, 95, false);

        System.out.println(student1.isEligibleForAward());
        System.out.println(student2.isEligibleForAward());
        System.out.println(student3.isEligibleForAward());
    }
}