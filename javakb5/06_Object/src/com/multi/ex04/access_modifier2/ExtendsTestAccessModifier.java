package com.multi.ex04.access_modifier2;

import com.multi.ex04.access_modifier.AccessModifier;

//다른 패키지에서 상속시킬 클래스, 나중에 상족할 때 다시 문법 정리!
public class ExtendsTestAccessModifier extends AccessModifier {

    public void testMethod(){
        //다른 패키지 이지만, 상속 받은 자식클래스에서 접근 테스트!
        publicValue = 1;
        protectedValue = 1;
//        defaultValue = 1; //안됨
//        privateValue = 1; //안됨
    }
}
