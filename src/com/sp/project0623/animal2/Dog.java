package com.sp.project0623.animal2;

//* this 에 대해 알아보기
//this란 레퍼런스 변수이다.
//단, 변수명은 이미 java 프로그램에서 정해져 있다.
public class Dog{
	String name;

	public void run(){
		this.name="puddle";
	}

	public static void main(String[] args){
		Dog d=new Dog();
		this.name="둘리"; //> 불가 Dog 인스턴스가 생성된 뒤 Dog의 this. 는 Dog의 인스터스 영역 즉 heap 영역에서 쓸 수 있다. 
	}
}
