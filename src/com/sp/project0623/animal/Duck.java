package com.sp.project0623.animal;

//오리를 정의한다
public class Duck extends Bird{
	String name="오리";
	int wingCount=2;

	//상속관게에서, 부모의 생성자가 인수있는 즉 매개변수가 있는 생성자일 경우
	//자식 생성자에서의 자동으로 호출하던 (디폴트) super()는 더이상 사용하면 안되고 
	//개발자가 생성자를 직접 정의하여 처리해야 한다.
	public Duck(){
		//int x=3; //부모의 클래스 작업이 먼저 처리돼야 하는데 
		super(true);
	}
	
	public void fly(){
		Duck d=new Duck();
		System.out.println(name+"가 팔딱거려요.");
	}
	
	public static void main(String[] args){
		Duck d = new Duck();
	}

	/*
	public void fly(){
		System.out.println(name+"가 팔딱거려요.");
	}
	*/
}
