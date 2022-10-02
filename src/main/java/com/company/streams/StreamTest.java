package com.company.streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) throws IOException {
//        Stream.Builder<Integer> empStreamBuilder = Stream.builder();
//
//        empStreamBuilder.accept(0);
//        empStreamBuilder.accept(1);
//        empStreamBuilder.accept(2);
//
//        Stream<Integer> empStream = empStreamBuilder.build();
//
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 6, 7, 8);
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("String");
//        stringList.add("car");
//
//        Stream<List<String>> stringList1 = Stream.of(stringList);
//
//        Stream<String> stream = stringList.stream();

//
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//
//        integers.stream().forEach(integer -> {
//            integer = integer + 1;
//            System.out.println(integer);
//        });
//
//        System.out.println(integers);

//        Integer[] empIds = {1, 2, 3, 4};
//
//        List<Integer> employees = Stream.of(empIds)
//                .filter(e -> e != 0)
//                .filter(e -> e > 2).toList();
//
//        System.out.println(employees);
//        System.out.println(Arrays.toString(empIds));


//        List<List<String>> namesNested = Arrays.asList(
//                Arrays.asList("Jeff", "Bezos"),
//                Arrays.asList("Bill", "Gates"),
//                Arrays.asList("Mark", "Zuckerberg"));
//
//
//        List<String> namesFlatStream = namesNested.stream()
//                .flatMap(Collection::stream).toList();
//
//        System.out.println(namesFlatStream);


//        Employee[] arrayOfEmps = {
//                new Employee(1, "Jeff Bezos", 100000.0),
//                new Employee(2, "Bill Gates", 200000.0),
//                new Employee(3, "Mark Zuckerberg", 300000.0)
//        };


//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(1, "Aslonbek", 10000D));
//        employeeList.add(new Employee(2, "MuhammadQodir", 20000D));
//        employeeList.add(new Employee(3, "Yoqub", 30000D));
//        employeeList.add(new Employee(3, "Yoqub", 31000D));
//
//        System.out.println(employeeList);

//        List<Employee> collect = employeeList.stream()
//                .peek(e -> e.salaryIncrement(10.0))
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//
//        System.out.println(employeeList);
//        System.out.println(collect);


//        Stream.generate(() -> 1)
//                .limit(5)
//                .forEach(System.out::println);


//        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);
//
//        evenNumStream
//                .limit(5)
//                .forEach(System.out::println);


//        String[] words = {
//                "hello",
//                "refer",
//                "world",
//                "level"
//        };
//
//        try (PrintWriter pw = new PrintWriter(
//                Files.newBufferedWriter(Paths.get("src/main/resources/streams")))) {
//            Stream.of(words).forEach(pw::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Stream<String> lines = Files.lines(Paths.get("src/main/resources/streams"));
//
//        List<String> collect = lines.filter(s -> s.length() > 0)
//                .filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))
//                .collect(Collectors.toList());
//
//        System.out.println(collect);


//        Stream.iterate(1, i -> i + 1)
//                .takeWhile(integer -> integer < 10)
//                .map(x -> x * x)
//                .forEach(System.out::println);


//
    }


}
