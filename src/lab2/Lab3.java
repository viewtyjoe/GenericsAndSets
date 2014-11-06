/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;
import common.*;

/**
 *
 * @author viewt_000
 */
public class Lab3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Davis", "Nathaniel", "123-45-6789"));
        employeeList.add(new Employee("Test", "John", "122-44-6189"));
        employeeList.add(new Employee("Lamb", "Mary", "123-45-6789"));
        employeeList.add(new Employee("Robertson", "Bob", "223-45-6782"));
        System.out.println(employeeList.size());
        Employee e2 = employeeList.get(1);
        System.out.println(e2.toString());
        System.out.println("Looping through list");
        for(Employee e: employeeList)
        {
            System.out.println(e);
        }
        System.out.println("Iterating through list via Iterator");
        Iterator iterator = employeeList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("Testing contains()");
        System.out.println(employeeList.contains(e2));
    }
}
