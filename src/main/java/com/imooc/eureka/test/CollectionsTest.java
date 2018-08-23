package com.imooc.eureka.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsTest {
    public  static void main (String[] args) {

//        String[] names = {"Ban","yanyy","Coco","lalal","Can","anna",""};
//        //过滤首字母为C的名字
//        List<String> ls = Arrays.asList(names).stream().filter(s -> s.startsWith("C")).collect(Collectors.toList());
//        //过滤不为空的数据
//        List<String> ls2 = Arrays.asList(names).stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
//        System.out.println(ls2.toString());
//
//        //forEach 用来迭代流中的每个数据
//        Arrays.asList(names).stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2,3,5,3);
        List<Integer> number = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        for (Integer num : number) {
            System.out.println(num);
        }
        System.out.println(number);
        //去除重复
        List<Integer> number2 = numbers.stream().map(n -> n * n).distinct().collect(Collectors.toList());
        System.out.println(number2);
    }


}
