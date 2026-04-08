package code;

class Calc { // Super, Parent, Base

	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

class CalcAdv extends Calc { // sub, child, derived
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
}
//This is Single level Inheritance

//Now will see multilevel inheritance by creating one more child class
class CalcVeryAdv extends CalcAdv{
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		CalcVeryAdv c1 = new CalcVeryAdv(); // we have to create object for child class not for the parent class
		c1.add(5, 5);
		c1.sub(4, 2);
		c1.mul(3, 4);
	}
}
