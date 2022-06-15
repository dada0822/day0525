package day0525;

public class Bus {

	int num;
	double gas;
	
	// 생성자
	Bus(){
		num = 1234;
		gas = 10.2d;
		System.out.println("버스가 만들어졌어요!");
	}
	
	public void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
