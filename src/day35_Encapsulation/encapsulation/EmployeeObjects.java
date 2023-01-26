package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1= new Employee("", 'f', 33, 100000);// if the fields are invalid, it will give default data instead of it
        e1.setAge(34);
        System.out.println(e1.getSalary());
        System.out.println(e1);
        Employee e2=new Employee("Aygun", 'f', 30, 110000);
        System.out.println(e2);
        e2.setSalary(15000+ e2.getSalary());
        System.out.println(e2);


    }
}
