/*새를 정의한다*/
package com.sp.project0623.animal;

public class Bird{
	String name="새";
	int wingCount=2;
	private boolean hasFeather=true;

	public Bird(boolean hasFeather){
		System.out.println("새의 초기화를 위한 생성자 호출");
		this.hasFeather=hasFeather;
	}

	//java에서는 상속받은 자식이 메모리에 올라가면 부모는 자동으로 메모리에 올라간다.
	public void fly(){
		System.out.println(name+"가 팔딱거려요.");
	}
}
