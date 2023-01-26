package day30_CustomClass;

import java.util.ArrayList;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee emp1=new Employee();
        emp1.setInfo("Umran", 1235, 'F',"SDET" ,85000,true);
        Employee emp2=new Employee();
        emp2.setInfo("Eren", 1233, 'M',"Data Analytics" ,110000,true);
        Employee emp3=new Employee();
        emp3.setInfo("Buse", 1232, 'F',"Digital Market Specialist" ,25000,false);
        Employee emp4=new Employee();
        emp4.setInfo("John", 1231, 'M',"Software Developer" ,120000,true);
        Employee emp5=new Employee();
        emp5.setInfo("Adam", 1205, 'M',"SDET" ,30000,false);
        Employee emp6=new Employee();
        emp6.setInfo("Joshua", 1204, 'M',"Software Developer" ,100000,true);

        Employee[] employees= {emp1, emp2,emp3, emp4,emp5, emp6};
        ArrayList<Employee> fulltime=new ArrayList<>();
        ArrayList<Employee>  partTime=new ArrayList<>();
        double min= employees[0].salary;
        double max= employees[0].salary;

        for (Employee each : employees) {
            if(each.isFullTime==true){
                fulltime.add(each);
            }else {
                partTime.add(each);
            }
            if (min<each.salary){
                min=each.salary;
            }
            if (max > each.salary) {
                max=each.salary;
            }
        }
        System.out.println("partTime = " + partTime);
        System.out.println("fulltime = " + fulltime);
        System.out.println("there are "+ fulltime.size() + " full time employees.");
        System.out.println(max);
        System.out.println(min);


    }
}
/*
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary

 */