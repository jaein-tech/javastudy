package javaUtill.exam;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

//	어노테이션(Annotation) - 소스코드에 메타코드(추가정보)를 주는것
//	class가 컴파일되거나 실행될 때 어노테이션의 유무나 어노테이션에 설정된 값을 통하여 class가 좀 더 다르게 실행되게 할 수 있다.
//	이런 이유로 어노테이션을 일정의 설정파일처럼 설명하는 경우도 있다.
	
//	class나 method위에 붙여서 사용가능 
//	ex) @Override
	
//	어노테이션은 자바가 기본으로 제공해주는 것도 있고, 사용자가 직접 만들 수도 있다.
//	커스텀 어노테이션 사용방법
//	1. 어노테이션을 정의한다.
//	2. 어노테이션을 클래스에서 사용한다. (타겟에 적용)
//	3. 어노테이션을 이용하여 실행.
	
}
