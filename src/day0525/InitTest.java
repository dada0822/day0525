package day0525;

public class InitTest {

	static int cv = 1; // 명시적 초기화 (선언과 동시에 값 넣기)
	int iv = 1; // 명시적 초기화
	
	static {
		cv = 2; 
	} // 클래스 초기화 블럭
	
	{
		iv = 2;
	} // 인스턴스 초기화 블럭
	
	// 생성자 초기화
	InitTest(){
		iv = 3;
	}
	
	public static void main(String[] args) {
		
		InitTest it = new InitTest();
		
		System.out.println(cv); // 같은 파일 안에 있으니까 InitTest.cv라고 안 해도 됨
		System.out.println(it.iv);

	}

}
