package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
         Employee emp1= new Employee("Umran");
        System.out.println(emp1);
        Employee emp2= new Employee("Umran", 'f');
        Employee emp3= new Employee("John", 'f', 100000);
    }
}
