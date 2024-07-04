package com.multi.ex04.access_modifier2;

import com.multi.ex04.access_modifier.AccessModifier;

//같은 패키지 내 Class 영역
public class TestAccessModifier2 {
    public static void main(String[] args) {
        //AccessModifier 같은 패키지에서 멤버변수 접근 테스트
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicValue = 1;
//        accessModifier.protectedValue = 1;
//        accessModifier.defaultValue = 1;
//        accessModifier.privateValue = 0; -> private은 직접 접근할 수 없다. ! (간접접근만 가능 - getter, setter)
    }
}
