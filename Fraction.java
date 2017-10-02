public class Fraction{
	
	private int a;
	private int b;
	
	public Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return ("" + this.a+"/"+this.b);
	}
	
	public static void main(String[] args) {
		Fraction f = new Fraction(5, 2);
		System.out.println("La fraction de f est : " + f);
	}
}