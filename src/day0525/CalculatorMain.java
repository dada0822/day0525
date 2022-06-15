package day0525;

public class CalculatorMain {

	public static void main(String[] args) {
		
		/* 정사각형과 직사각형의 넓이를 계산하는
		 * areaRectangle 메서드를 오버로딩하여 작성하고
		 * 정사각형의 길이는 10,
		 * 직사각형의 넓이는 가로 10, 세로 20으로 계산하여
		 * 각각의 넓이를 출력하시오. */

		Calculator myCal = new Calculator();
		
		double result1 = myCal.areaRectangle(10);
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);

	}

}
