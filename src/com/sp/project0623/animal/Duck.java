package com.sp.project0623.animal;

//������ �����Ѵ�
public class Duck extends Bird{
	String name="����";
	int wingCount=2;

	//��Ӱ��Կ���, �θ��� �����ڰ� �μ��ִ� �� �Ű������� �ִ� �������� ���
	//�ڽ� �����ڿ����� �ڵ����� ȣ���ϴ� (����Ʈ) super()�� ���̻� ����ϸ� �ȵǰ� 
	//�����ڰ� �����ڸ� ���� �����Ͽ� ó���ؾ� �Ѵ�.
	public Duck(){
		//int x=3; //�θ��� Ŭ���� �۾��� ���� ó���ž� �ϴµ� 
		super(true);
	}
	
	public void fly(){
		Duck d=new Duck();
		System.out.println(name+"�� �ȵ��ŷ���.");
	}
	
	public static void main(String[] args){
		Duck d = new Duck();
	}

	/*
	public void fly(){
		System.out.println(name+"�� �ȵ��ŷ���.");
	}
	*/
}
