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
public class Lab5 {
    public static void main(String[] args) {
        //Using SSN for key since SSN is used to generate hash and to test equality
        Map<String, Employee> employeeMap = new HashMap<>();
        Employee e1 = new Employee("Davis", "Nathaniel", "123-45-6789");
        employeeMap.put(e1.getSsn(), e1);
        Employee e2 = new Employee("Test", "John", "122-44-6189");
        employeeMap.put(e2.getSsn(), e2);
        Employee e3 = new Employee("Lamb", "Mary", "123-46-6789");
        employeeMap.put(e3.getSsn(), e3);
        Employee e4 = new Employee("Robertson", "Bob", "223-45-6782");
        employeeMap.put(e4.getSsn(), e4);
        System.out.println(employeeMap.size());
        System.out.println("Getting value...");
        Employee test = employeeMap.get(e2.getSsn());
        System.out.println(test.toString());
        System.out.println("Testing adding item with existing key");
        //When you put an object into a map, the method also returns the item that previously existed
        //at that key value.
        Employee removed = employeeMap.put(e1.getSsn(), new Employee("Incorrect", "Data", "123-45-6789"));
        System.out.println("Displaying removed value");
        System.out.println(removed);
        System.out.println("Displaying value added: ");
        System.out.println(employeeMap.get(e1.getSsn()));
        Set<String> keySet = employeeMap.keySet();
        System.out.println("Iterating over key set...");
        for(String k: keySet)
        {
            System.out.println(employeeMap.get(k));
        }
        System.out.println("Iterating over values...");
        Collection<Employee> values = employeeMap.values();
        for(Employee e: values)
        {
            System.out.println(e);
        }
    }
}
