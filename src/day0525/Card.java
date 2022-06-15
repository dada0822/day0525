package day0525;

public class Card {

	/* 1. Card.java 생성
	 * - 필드 : name (주문자), orderAmt (주문 금액)
	 * - 메서드 : pointAmt
	 * 
	 * 2. CardMain.java 생성
	 * - 출력결과
	 * 김그린님의 구매금액 10000원에 대한 포인트 적립액은 300원입니다.
	 * 박자바의 구매금액 30000원에 대한 포인트 적립액은 900원입니다. */
	
	String name;
	int orderAmt;
	
	Card(){}
	
	Card(String name, int orderAmt){
		this.name = name;
		this.orderAmt = orderAmt;
	}
	
	void pointAmt() {
		int point = (int)(orderAmt * 0.03);
		System.out.printf("%s님의 구매금액 %d원에 대한 포인트 적립액은 %d원입니다.%n", name, orderAmt, point);
	}
}
