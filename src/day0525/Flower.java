package day0525;

public class Flower {

	/* 클래스명 : Flower.java
	 * 필드 : name, cost
	 * 메서드 : flowerInfo
	 * FlowerMain.java
	 * 매개변수 2개짜리 생성자를 호출
	 * 
	 * 출력결과 :
	 * 장미 한송이의 가격은 1,500원입니다.
	 * 튤립 한송이의 가격은 2,000원입니다. */
	
	String name;
	int cost;
	
	Flower(){} // 기본 생성자
	
	Flower(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	public void flowerInfo() {
		System.out.printf("%s 한송이의 가격은 %,d원입니다.\n", name, cost);
	}
}
