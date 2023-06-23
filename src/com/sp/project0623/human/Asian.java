package com.sp.project0623.human;
public class Asian extends Human{
						  /*is a*/
	String color="yellow";
	int legs=2;
	boolean hasName=true;

	/*
	public Asian(){
		1)상속 관계이기 때문에 부모의 클래스를 먼저 생성. (디폴트로) 하지만 부모 클래스는 매개변수를 가지고 있으므로
			디폴트 생성자로는 만족할 수 없음. 
		2)오버로딩으로 매개변수가 필요없는 클래스를 따로 만들거나 
		3)매개변수를 지정한 생성자를 호출해야 함
	}
	*/
	
	public Asian(){
		new Human(true);
	}

	public static void main(String[] args){
		new Asian();
	}

}
