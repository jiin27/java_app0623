package com.sp.project0623.human;
public class Asian extends Human{
						  /*is a*/
	String color="yellow";
	int legs=2;
	boolean hasName=true;

	/*
	public Asian(){
		1)��� �����̱� ������ �θ��� Ŭ������ ���� ����. (����Ʈ��) ������ �θ� Ŭ������ �Ű������� ������ �����Ƿ�
			����Ʈ �����ڷδ� ������ �� ����. 
		2)�����ε����� �Ű������� �ʿ���� Ŭ������ ���� ����ų� 
		3)�Ű������� ������ �����ڸ� ȣ���ؾ� ��
	}
	*/
	
	public Asian(){
		new Human(true);
	}

	public static void main(String[] args){
		new Asian();
	}

}
