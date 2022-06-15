package day0525;

public class MemberTest {

	public static void main(String[] args) {

//		Member m = new Member();
		
//		m.setMemberDate("김그린", "010-1111-2222", "울산시 남구 삼산동");
//		m.print();
		
		Member m1 = new Member("010-1111-2222", "울산시 남구");
		m1.print();
		
		Member m2 = new Member("010-8888-9999", "부산시 연제구");
		m2.print();
		
		Member m3 = new Member(); // 기본 생성자 Member(){} 추가해줘서 에러가 없어짐

	}

}
