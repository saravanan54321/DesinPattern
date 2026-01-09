package org.basics;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practcie {


    public static void main(String[] args) {

        //sum

        List<Integer> list = List.of(10, 20, 30);
//        int sum = list.stream().mapToInt(i -> i).sum();
//        System.out.println(sum);


        //-------------------------------------------

//// finding avg
        List<Integer> avng = List.of(10, 20, 30);

// note avg return optional -> if you put orelse it will return double
//
//       double avg = avng.
//                stream()
//                .mapToInt(i->i)
//                .average().orElse(0);
//

        //-----------------------------------------------

        // finding min and max
//        double max = avng.
//                stream()
//                .mapToInt(i->i)
//                .max().orElse(0);
//        double min = avng.
//                stream()
//                .mapToInt(i->i)
//                .min().orElse(0);

//---------------------------ascending order ----------------

//        avng.stream().sorted().forEach(System.out::println);

//        List<Integer> ls = avng.stream().sorted().toList();
//        System.out.println(ls);


//----------------Descending order ----------------------
//        avng.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//     List<Integer> li=   avng.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(li);


 //--------------------------------SUMofDigitofanumber------------------------------------------
//        int input = 12345;
//        IntStream s =String.valueOf(input).chars();
//       s.map(a -> a-'0').forEach(System.out::println);

      // or u can use this also
//        int input = 12345;





//        IntStream s =String.valueOf(input).chars();
//       int res=  s.map(a -> Character.getNumericValue(a)).sum();
//        System.out.println(res);



        //------------count the frequency of a character(asked in capgemini )------------------
        //output -{ =1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
        //Function.identity()-> for taking the paricula caaracter
        // you can use this this also will work a->(a)
        // mapTOObj converting int to object
        String s = "Hello World";
        // just check what it is printing
//        s.chars().mapToObj(i->(i)).forEach(System.out::println);

            // 1. normally printing map
//     Map<Character,Long>  ot = s.chars().mapToObj(i->((char)i)).collect(Collectors.groupingBy(
//                Function.identity(),Collectors.counting()
//        ));
////        instead of function.identity() i have used c->c;
//        Map<Character,Long>  ot = s.chars().mapToObj(i->((char)i)).collect(Collectors.groupingBy(
//                c->c,Collectors.counting()
//        ));
////
//        System.out.println(ot);
//----------------------------------------------------------------------
        // if you want remove space in the output
//
//        Map<Character, Long> ott =
//                s.chars()
//                        .mapToObj(c -> (char) c)
//                        .filter(ch -> ch != ' ')         // remove space
//                        .collect(Collectors.groupingBy(
//                                Function.identity(),
//                                Collectors.counting()
//                        ));
//        System.out.println(ott);

  //-----------------------------------------------------------------------

        // printing only non repeating character
        // using for loop
        //here collect  and for loop are there looks like two terminal operations
        // but after collect the stream closed
        // i am iterating  a map only so that is not consider as a termninal operation

//         s.chars().mapToObj(i->((char)i))
        // removinga space
//                 .filter( k-> k != ' ' )
//
//        .collect(Collectors.groupingBy(
//                Function.identity(),Collectors.counting()
//        )).forEach((k,v)-> {
//
////            System.out.println( "Key " +k + " " + " value "+ v );
//
//            if( v< 2 ){
//                System.out.println(  k + " " + v);
//            }
//
//        });

//-----------------------------------------------------------------------------
//        String cap = "Capgemini";
//
//     String result=   cap.chars()
//                .mapToObj(i-> (char) i)
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter( i -> i.getValue() <2 )
//                .map(j -> String.valueOf(j.getKey()))
//                .collect(Collectors.joining());
//
//     System.out.println(result);
        ;



//

//----------------------------------------------------------------------------------
        // ---------------------reverse each word of a string-----------------

//        String ins = "Hello java world";

//        String res = Stream.of(ins.split(" ")).map(word-> new StringBuilder(word).reverse().toString())
//                .collect(Collectors.joining( " "));
//        System.out.println(res);

  //--------------------------------------------------------

    //    find second largest
//             List<Integer> ls =   Arrays.asList(10,20,35,50,50,65,76);
//             // note return type int potalum workaguthu
//          Integer slargest=  ls.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
//                     .findFirst().get();
//        System.out.println(slargest);
//----------------------------------------------------------

        // find age of the person
//        System.out.println("Enter your DOB : YYYY-MM-DD");
//        Scanner sc = new Scanner(System.in);
//        String birthdate= sc.nextLine();
//
//
//        LocalDate lc=LocalDate.parse(birthdate);
//        LocalDate lcc = LocalDate.now();
//
//        Period age = Period.between(lc,lcc);
//        System.out.println("age:"+ age.getYears());











//----------------------------------------------------
        // summing in custom object
        List<Employee> employees = Arrays.asList(
                new Employee("Arun",   "IT",     55000),
                new Employee("Bhavya", "IT",     72000),
                new Employee("Kiran",  "HR",     43000),
                new Employee("Ravi",   "HR",     51000),
                new Employee("Meena",  "Finance",65000),
                new Employee("Suresh", "Finance",47000),
                new Employee("Suresh", "Mechanical",4700),
                new Employee("John",   "Sales",  40000)
        );
        Map<String, Set<Employee>> map =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getName,
                                Collectors.toSet()
                        ));

        System.out.println(map);


// finding sum
//        Double salary =employees.stream().mapToDouble(Employee::getSalary).sum();
//        System.out.println(salary);
        //-----------------------------------------------------------
// finding avg
        // here maptoDouble knows returns doublestream it know how to compare
        // so we dindt use Comparator.comparing this
//        Double salary =employees.stream().mapToDouble(Employee::getSalary)
//                .average().orElse(0);
//            System.out.println(salary);

        // finding max
// directly we are using this
        //Comparator.comparing
//        Optional<Employee> second =employees.stream().
//                max(Comparator.comparing(Employee::getSalary));
//
//        System.out.println(second);


        //--------------------uppercase-------------------
//        employees.stream().map((employee -> employee.getName().toUpperCase())).
//                forEach(System.out::println);


        //-----------------------print the employee object whoes name are same  (capegemini questions )--------------------------

        // simple approach

        //        Map<String, List<Employee>> nameCount =
//        employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getName
//
//                )).forEach((name,listOfEmployee)->{
//                    if(listOfEmployee.size()>1){
//                          System.out.println(name);
//                        System.out.println(listOfEmployee);
//                    }
//                });

        // bit complex apporach but useful in some other situation
// it doesnt contains entire object it has only key and value
//        Map<String, Long> nameCount =
//                employees.stream()
//                        .collect(Collectors.groupingBy(
//                                Employee::getName,
//                                Collectors.counting()
//                        ));
        // edhula la full employess object eruku athan etha print panurom

//        employees.stream()
                // if it returns true i am just printing the object
                //What is e?
                //e = one Employee object
                //Employee{id=1, name="Ravi"}

                // e.getName()
                 //"Suresh"

        //nameCount.get("Suresh") → 2
        //Checks:
       // Is 2 > 1 ? → true

//                .filter(e-> nameCount.get(e.getName())>1)
//                .forEach(System.out::println);
////



//----------------------------------------------------------------------

//        Map<String, List<Employee>> nameCount =
//                employees.stream()
//                        .collect(Collectors.groupingBy(
//                                Employee::getName
//
//                        )).forEach((k,v)->{
//                              if(v.size()>1){
//                                  System.out.println(v);
//                              }
//                        });

//-------------------------------------------------------------------------------
// partioning by
        // edhu sql matiri behave panathu
        // true or false matum than , rownumber lam vachurukathu


        //grouping by take function as a argumnets;
        //partition by takes predicate as a arguments;

        // segregate based on the salary using partioning by

// printing employee less that 5000
//        Map<Boolean,List<Employee>> m =employees.stream().collect(Collectors.
//                partitioningBy(employee -> employee.getSalary()<5000))
//
//                ;
//
//
//        m.get(true).forEach(System.out::println);
//        m.get(false).forEach(System.out::println);
//-------------------------------------------------------

       // another way
//       employees.stream().collect(Collectors.
//                partitioningBy(employee -> employee.getSalary()<5000))
//                .forEach((k,v)->{
////                    System.out.println(k);
////                    System.out.println(v);
//                    //or
//                    if (k ==true){
//                        System.out.println(v);
//                    }
//
//                });

                ;

//----------------------------------------------------------------

//
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
//
//        Map<Boolean, List<Integer>> result =
//                numbers.stream()
//                        .collect(Collectors.partitioningBy(
//                                n -> n % 2 == 0
//                        ));
//
//        System.out.println("Even numbers  : " + result.get(true));
//        System.out.println("Odd numbers   : " + result.get(false));

        //output
//        Even numbers  : [2, 4, 6]
//        Odd numbers   : [1, 3, 5, 7]

        //---------------------9-------------
//        Map<Boolean, Long> count =
//                numbers.stream()
//                        .collect(Collectors.partitioningBy(
//                                n -> n % 2 == 0,
//                                Collectors.counting()
//                        ));
//
//        System.out.println(count);


//output
        //
        // {true=3, false=4}




    }
}
