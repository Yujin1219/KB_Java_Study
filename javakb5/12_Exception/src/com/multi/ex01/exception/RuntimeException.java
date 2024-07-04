package com.multi.ex01.exception;

import java.util.Objects;

public class RuntimeException {
    // Error(오류)란?
    //  : 프로그램 수행 시 치명적 상황이 발생하여 비정상 종료 상황이 발생한 것, 프로그램 에러라고도 함
    // 에러의 종류
    //  1. 컴파일 에러 : 프로그램의 실행을 막는 소스 상의 문법 에러, 소스 구문을 수정하여 해결
    //  2. 런타임 에러 : 입력 값이 틀렸거나, 배열의 인덱스 범위를 벗어났거나,계산식의 오류 등 주로 if문 사용으로 에러 처리
    //  3. 시스템 에러 : 컴퓨터 오작동으로 인한 에러, 소스 구문으로 해결 불가

    // 에러 처리방법 2가지
    // 1. throws로 외부로 에러를 위임하기
    // 2. try-catch 문으로 에러를 직접 처리하기

    public static void main(String[] args) {
        // RunTime Error : 실행중에 발생할수 있는 예외로, 예외처리로 막을수 있는 예외들

        //java.lang.ArithmeticException : / by zero
//        int a = 10 / 0;
//        System.out.println(a);

        //java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
//        int[] array = new int[10];
//        array[12] = 10;
//

        // java.lang.NegativeArraySizeException: -1
//        int[] array = new int[-1];

        //java.lang.NullPointerException: Cannot invoke "String.toString()" because "str" is null
//        String str = null;
//        str.toString();

        //java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String
        //->위에 에러는 문법적인 이유도 있지만, 보안성 때문에 막는다.
//        Object obj = new Object(); //10byte
//        String str = (String) obj; //1kbyte


        // System Error = 시스템 에러로 반드시 죽는 에러, 예외처리로 막을수 없다.

        //java.lang.OutOfMemoryError: Overflow: String length out of range
//        try {
//            String str = "121321345645678890987989567890";
//            while(true){
//                str += str;
//            }
//        } catch (Exception e) {
//            throw new java.lang.RuntimeException(e);
//        }

        //java.lang.StackOverflowError : 대뷰뷴 사용자가 잘못한 에러...
//        method();

    }
//
//    public static void method(){
//        int temp = 0;
//        method();
//    }
}
