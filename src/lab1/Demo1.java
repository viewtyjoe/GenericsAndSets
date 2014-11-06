/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.*;
import common.Employee;
/**
 *
 * @author viewt_000
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("One");
        shoppingList.add("Two");
        shoppingList.add("Three");
        shoppingList.add("One");
        shoppingList.add("Two");
        shoppingList.add("Three");
        shoppingList.stream().forEach((s) -> {
            System.out.println(s);
        });
        
        List<String> shortList = new LinkedList<>();
        shortList.add("One");
        shortList.add("Two");
        
        if(shoppingList.retainAll(shortList))
        {
            System.out.println("List changed:");
            shoppingList.stream().forEach((s) -> {
                System.out.println(s);
            });
        }
        else
        {
            System.out.println("List did not change.");
        }
        
        Employee e1 = new Employee("Jones", "Sally", "333-33-3333");
        Employee e2 = new Employee("Jones", "Sally", "333-33-3333");
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        
        Set<Employee> employeeSet = new HashSet<>(employeeList);
        employeeList = new ArrayList<>(employeeSet);
        
        employeeSet.stream().forEach((s) -> {
            System.out.println(s);
        });
    }
}
