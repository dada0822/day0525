package day0525;

public class BoxVolume {

	public static void main(String[] args) {
		
//		Box b = new Box(); // 기본생성자가 있어서 오류 발생 안 함
		Box b = new Box(20, 20, 30);
		
		System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");

	}

}
