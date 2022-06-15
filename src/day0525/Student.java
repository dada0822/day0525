package day0525;

public class Student {

	/* Student 클래스의 StudentMain 클래스를 작성하여
	 * 학생의 성적을 계산하여 결과를 출력하시오.
	 * String 	name	학생이름
	 * int 		ban 	반
	 * int 		no 		번호
	 * int 		kor 	국어점수
	 * int		eng		영어점수
	 * int		math	수학점수 
	 * 
	 * 1. Student클래스에 getTotal() 메서드를 생성하시오
	 * - 메서드명 : getTotal()
	 * - 기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더하여 결과값을 반환
	 * - 매개변수 : 없음
	 * 
	 * 2. Student 클래스에 getAverage() 메서드를 생성하시오
	 * - 메서드명 : getAverage()
	 * - 기능 : 총점(국어+영어+수학)을 과목수로 나눈 평균을 출력
	 * 			단, 소수점 둘째자리에서 반올림할 것
	 * - 반환타입 : float
	 * - 매개변수 : 없음
	 * 
	 * -- 출력 결과
	 * 이름 : 김그린
	 * 총점 : 230
	 * 평균 : 76.7 */
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){} // 기본 생성자
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
//		return (int)(getTotal()/3f * 100 + 0.5f) / 100f; // 소수점 둘째자리
	}
	
}
