package ch07;

public class Outer {
	int width = 10;
	int height = 10;
	
	Outer(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	//method 앞에 붙는것은 Return형
	public Inner getInner() {
		return new Inner();
	}
	
	//Class 안 Class = Inner Class
	class Inner {
		int depth = 10;
		public int volume() {
			return width * height * depth; //부피
		}
	}
	
	
	
}
