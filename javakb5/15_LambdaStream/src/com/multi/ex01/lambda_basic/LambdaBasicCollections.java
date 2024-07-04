package com.multi.ex01.lambda_basic;

import java.util.ArrayList;
import java.util.List;

public class LambdaBasicCollections {
    //  https://docs.oracle.com/javase/8/docs/api/java/util/List.html?is-external=true
    // 컬렉션에서 다양한 람다식 사용 실습
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println(list);


        //1. forEach : list를 stream으로 변경해주는 메소드
        //필요인자 : public interface Consumer<T>
        //람다식 꼴 : void accept(T t);
        //-> 리턴값은 없고 인자 1개를 가진 메소드를 구현하면 된다.

        list.forEach(v -> System.out.println(v + ","));
        System.out.println();
        list.forEach(System.out::println);
        System.out.println();

        //2. removeif : list에서 일부 조건을 제거해주는 기능
        //인자 : Predicate = 필터 용도
        //람다 꼴 : boolaen test(T t);
        //짝수 제거 예시

        list.removeIf(v -> v % 2 == 0 || v < 5);
        System.out.println(list);

        //3. replaceAll : 인자를 모두 변경해주는 기능
        //인자 : Funcion<T, R>
        //R appply(T t); //인자가 있고 리턴값이 있는 함수
        //자신을 10으로 곱한 수로 만드렁주는 연산
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list2.replaceAll(v -> v * 10);
        System.out.println(list2);///

    }

}
