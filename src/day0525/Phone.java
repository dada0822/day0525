package day0525;

public class Phone {

	/* Phone.java를 생성하여 
	 * make(제조사), color(색상), price(가격)을 입력받도록
	 * 생성자를 작성하고
	 * 결과를 화면에 출력하는 phoneMain.java를 생성하시오.
	 * 
	 * 출력 결과
	 * 제조사 : samsung / 색상 : black / 가격 : 1200000
	 * 제조사 : apple / 색상 : white / 가격 : 1090000 */
	
	String make;
	String color;
	int price;
	
	Phone(){}
	
	Phone(String make, String color, int price) {
		this.make = make;
		this.color = color;
		this.price = price;
	}
	
}
