public class Employee{
    private static int basePay;
    private String name;
    private int bonus;

    public Employee(String n, int b){
        name = n;
        bonus = b;
    }


    public changeBonusPay(double p){
        bonus = (int) (bonus * (p / 100 + 1));
    }

    public String toString(){
        return name + " makes $" + (Employee.basePay + bonus);
    }

    public static void setBasePay(int n){
        Employee.basePay = n;
    }

    public static int getBasePay(){
        return Employee.Employee.basePay;
    }

    public static void changeBasePay(double p){
        Employee.basePay = (int) (Employee.basePay * (p / 100 + 1));
    }
}