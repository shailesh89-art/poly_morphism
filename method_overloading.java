package demo;
class c{
	static void disp(int a, int y) {
		a=10;
		y=45;
		System.out.println(a + y);
	}
	static void disp(float b, float d) {
		b=15;
		d=55;
		System.out.println(b + d);
	}
}

public class method_overloading {

	public static void main(String[] args) {
		c.disp(7, 8);

	}

}
