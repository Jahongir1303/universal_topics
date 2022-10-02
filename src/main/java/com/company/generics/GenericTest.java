package com.company.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class GenericTest {
    public static void main(String[] args) {
//        List<?> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,"String"));
////        List<Double> collect = integers.stream().map(Integer::doubleValue).toList();
//        System.out.println(integers);
//
//
//        List<?> list = new ArrayList<>();


//        MyGen<String> stringMyGen = new MyGen<>();
//        stringMyGen.add("Malik");
//        System.out.println(stringMyGen.get());
//
//        printArray(new Integer[]{1,2,3});
//        List list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add("str");
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//
//        wildCard(list2);
//
//        wildCard(list1);
//
//        String str = "Ocean, Moscow, 123534";
//        boolean matches = str.matches("[A-Z]\\w+, [A-Z]\\w+, \\d{6}");
//        if(matches)
//            System.out.println("Correct information");


    }
    public static <E,U> E[] printArray(E[] elements,U category) {
        List<E> list = new ArrayList<>();
        for (E element : elements) {
            System.out.println(element);
        }
        return elements;
    }

    public static void wildCard(List<?> list){
        System.out.println(list);
    }
}
