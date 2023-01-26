package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.name= "Umran";
        emp1.salary=100000;
        Employee emp2= new Employee();
        emp2.name="Eren";
        emp2.salary=110000;
        Employee emp3= new Employee();
        emp3.name="Derya";
        emp3.salary=105000;
        System.out.println(emp1.name+ " "+ emp1.salary);
        System.out.println(emp2.name+ " "+ emp2.salary);
        System.out.println(emp3.name+ " "+ emp3.salary);
        System.out.println(emp3.isHuman);

    }
}
