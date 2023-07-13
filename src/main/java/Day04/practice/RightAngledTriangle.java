package Day04.practice;


public class RightAngledTriangle extends Polygon{

	protected double a;
	protected double b;
	
	public RightAngledTriangle(double a, double b) throws Exception {
		super(4);
		if(a <= 0 || b <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculateArea() {
		return (this.a * this.b)/2;
	}
	@Override
	public double calculatePerimeter() {
		   return (this.a + this.b + Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2)));
	}
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
