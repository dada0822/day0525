package day0525;

public class Box {

	int width;
	int length;
	int height;
	int volume;
	
	Box(){}
	
	// this : 객체 자기 자신을 참조
	Box(int width, int length, int height){
		this.width = width;
		this.length = length;
		this.height = height;
		volume = width * length * height;
	}
	
	public int getVolume() {
		return volume;
	}
	
}
