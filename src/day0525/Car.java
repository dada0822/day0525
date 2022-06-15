package day0525;

public class Car {

	String color; // 색상
	String gearType; // 기어 수동인지 오톤지
	int door; // 문 개수
	
	Car(){
		
		this("white", "auto", 4); // 생성자를 찾아가는
		// Car(String color, String gearType, int door) 호출
		
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	
	Car(String color){
		
		this(color, "auto", 4);
//		Car(String color, String gearType, int door) 호출
		
//		this.color = color; // 객체에 들어있는 필드값!
//		gearType = "auto";
//		door = 4;
	}
	
	Car(String color, String gearType, int door){ // 생성자 오버로딩
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
}
