package com.sp.project0623.animal2;

//* this �� ���� �˾ƺ���
//this�� ���۷��� �����̴�.
//��, �������� �̹� java ���α׷����� ������ �ִ�.
public class Dog{
	String name;

	public void run(){
		this.name="puddle";
	}

	public static void main(String[] args){
		Dog d=new Dog();
		this.name="�Ѹ�"; //> �Ұ� Dog �ν��Ͻ��� ������ �� Dog�� this. �� Dog�� �ν��ͽ� ���� �� heap �������� �� �� �ִ�. 
	}
}
