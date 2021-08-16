package ∂‡Ã¨;

public class Text {
	public static void main(String[] args){
		Animal a1 = new Animal();
		a1.move();
		Cat c1 = new Cat();
		c1.move();
		Bird b1 = new Bird();
		b1.move();
		
		Animal a2 = new Cat();
		a2.move();
		
		Cat c2 = (Cat)a2;
		c2.catchMouse();
		
		Animal a3 = new Bird();
		Cat c3 = (Cat)a3;
		c3.move();
	}
}
