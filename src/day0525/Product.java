package day0525;

public class Product {

	static int count = 0; // 인스턴스의 개수
	int serialNo;
	
	{ // 인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}
	
	public Product() {}
	
}
