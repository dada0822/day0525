package day0525;

public class Member {

//	String name;
	String name = "김그린"; // 필드 선언하면서 초기화, 값이 고정 > 명시적 초기화
	String tel;
	String address;
	
	Member(){}
	
//	Member() {
//		name = "no name";
//		tel = "no tel";
//		address = "no address";
//	} 
	
	Member(String tel, String address) {
//		name = "no name";
//		tel = "no tel";
//		address = "no address";
		
		this.tel = tel;
		this.address = address; // 생성자를 이용한 초기화
	} 
	
	void setMemberDate(String setName, String setTel, String setAddress) {
		name = setName;
		tel = setTel;
		address = setAddress;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
}
