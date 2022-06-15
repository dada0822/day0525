package day0525;

class Data_1{
	int value;
	
Data_1() {}

}

class Data_2{
	int value;
	
//	Data_2() {} // 기본 생성자 / 오버로딩!
	
	Data_2(int x) { // 오버로딩!
		value = x;
	}
}

public class Err {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(10);
//		Data_2 d3 = new Data_2(); 기본 생성자 없어서(주석 처리) 에러 발생

	}

}
