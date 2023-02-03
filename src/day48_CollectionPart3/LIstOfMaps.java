package day48_CollectionPart3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIstOfMaps {
    public static void main(String[] args) {
        List<Map<String, String>> employees= new ArrayList<>();
        Map<String,String> employee1= new HashMap<>();
        employee1.put("EmpID", "124");
        employee1.put("EmpName", "John");
        employee1.put("JobTitle", "SDET");
        employee1.put("Salary", "100000");

        Map<String,String> employee2= new HashMap<>();
        employee2.put("EmpID", "123");
        employee2.put("EmpName", "Mark");
        employee2.put("JobTitle", "Developer");
        employee2.put("Salary", "120000");

        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println(employee1);
        System.out.println(employees.get(0));
        System.out.println(employees.get(0).get("Salary"));//100000

        Integer total=0;
        for (Map<String, String> employee : employees) {
            total +=  Integer.parseInt(employee.get("Salary"));
            System.out.println(employee.get("Salary"));
        }
        System.out.println(total);




    }
}
