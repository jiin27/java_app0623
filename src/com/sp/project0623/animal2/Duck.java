package com.sp.project0623.animal2;
public class Duck extends Bird{
				/*Duck is a Bird*/
	String name="나는 오리";

	public void fly(){
		System.out.println("오리가 날아간다");
	}

	public static void main(String[] args){
		//1) 만일 오리가 새라면, 서로 같은 자료형으로 인정이 되고, 서로 같은 자료형이라면, 형변환도 가능해야 한다.
		/*
		byte b = 5;
		short s = 3;
		byte k=(byte)s;
		*/

		Duck d = new Duck();

//		System.out.println(d);

		//상속관게에서 부모와 자식이 동시에 인스턴스 생성될때는
		//부모, 자식의 인스턴스는 자식의 인스턴스로 군집화된다.
		//따라서 군집화된 인스턴스 내에서 부모의 인스턴스를 접근하려면 
		//up casting 연산자를 사용하고, 다시 자식으로 내려오려면 down casting을 사용한다.
		Bird b1=(Bird)d; 
		System.out.println(b1.name);

//		Duck d1=(Duck)b1; //다시 자식으로 내려오려면 down casting 사용
//		System.out.println(d1.name);

		//군집화된 인스턴스내에서 동일한 메서드가 오버라이딩 되어있다면
		//sun에서는 자식의 메서드를 업그레이드로 인정하여 자식의 메서드를 호출하여 준다.
		b1.fly(); //자식의 메서드를 호출하게 된다.
		
		

		//원칙: 해당 객체 자료형을 따라가면 되지만, 
		//예외: 단, 오버라이딩된 메서드가 있을 경우 자식의 메서드를 우선시 하다.

//		Bird b = new Bird(); //가리키는 범위로 크기를 판단. 따라서 항상 부모 클래스가 더 큰 자료형.

//		b = d; //새의 자료형으로 오리를 가리키고 있으므로, 자동 형변환이다.

//		d = (Duck)b; //down casting (부모 입장에서 하위 개념인 자식 클래스로 역할이 내려간 것)
//		System.out.println(d.name);
//		Duck c=(Duck)b;
//		System.out.println(c.name);

//		Bird k=(Bird)c; //up casting
//		System.out.println(k.name); //최종적으로 출력할 변수가 받은 값이 무슨 형인지만 확인하면 된다.

	}
}
