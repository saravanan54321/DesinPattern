package org.groupby;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1.convert streams into list

//        List<String> names = Arrays.asList("a", "b", "c");
//
//        List<String> result =
//                names.stream()
//                        .collect(Collectors.toList());
//
//
//        System.out.println(result);

//-------------------------------------------
        //2. simple group by


        List<String> names = Arrays.asList("ram", "raj", "ravi");

        //Map<Integer,List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));

//        System.out.println(result);


        // here you may have doubt without entry.set how its working fine
        // this foreach internally converts uses entry set
        //and biconsumer


     names.stream().collect(Collectors.groupingBy(String::length)).forEach((k,v)->{
         System.out.println("Key " + k);
         System.out.println("Value " + v );


     });


//        result.forEach((k,v)->{
//                        System.out.println("KEY "+ k);
//                    System.out.println("Value "+ v);
//        }
//                );

//-----------------------------------------------------------------------------







        //--------------------------------
        //2.1 -Group and sum numbers by even/odd
        // HERE Even and odd is the key
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//       Map <String,List<Integer>> f = numbers.stream().collect(Collectors.groupingBy(n->(n%2==0?"Even":"odd"))) ;
//        System.out.println(f);
//-----------------------------------------------------------------------------------

        //3.  2 nd type - groupingBy with downstream collector
        //Write a Java Stream API program to group employees by their department and
        // find the employee with the highest salary in each department.
//        List<Employee> employees = Arrays.asList(
//                new Employee("Arun",   "IT",     55000),
//                new Employee("Bhavya", "IT",     72000),
//                new Employee("Kiran",  "HR",     43000),
//                new Employee("Ravi",   "HR",     51000),
//                new Employee("Meena",  "Finance",65000),
//                new Employee("Suresh", "Finance",47000),
//                new Employee("John",   "Sales",  40000)
//        );
//        // frst compare and then use max
        // normal problems also we comapre and fix the max like same
//        Map<String, Optional<Employee>> k=employees.stream().
//                collect(Collectors.groupingBy(Employee::getDept,
//                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//
//
//        System.out.println(k);












    }
}
