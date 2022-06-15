package day0525;

public class Document {

	/* 문서의 제목이 있다면 문서명을 그대로 출력하고
	 * 만약 문서명을 지정하지 않았다면 
	 * '제목없음1.java', '제목없음2.java'....를 출력하는 
	 * Document.java와 DocumentMain.java를 생성하시오! */
	
	static int count = 0;
	String name;
	
	Document(){
//		count++;
		this.name = "제목없음" + ++count;
		System.out.println("문서 " + this.name + ".java가 생성됨");
		
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성됨");
	}
	
}
