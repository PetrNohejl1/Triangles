package petrNohejl;

public class Triangles {
	double a;
	double b;
	double c;
	double ha;

	public static Triangles factoryTriangles(double b, double a, double c, double ha) throws TrianglesException {

		if (b == c) {
			return new Triangles(a, b, c, ha);
		}
		if (a == b && b == c && a == b) {
			return new Triangles(a, b, c, ha);
		}
		if (a + b > c && a + c > b && b + c > a) {
			return new Triangles(a, b, c, ha);
		}
		if (a > 0 && b > 0 && c > 0) {
			return new Triangles(a, b, c, ha);

		} else {
			throw new TrianglesException("triangle cannot be constructed!!");
		}
	}

	public double getHe() {
		return ha;
	}

	public void setHe(double ha) {
		this.ha = ha;
	}

	public double getcontent() {
		return a * ha / 2;
	}

	public double getcircuit() {
		return a + b + c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	private Triangles(double a, double b, double c, double ha) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.ha = ha;

	}

	public String toString() {
		return "Side a = " + a + "| Side b = " + b + "| Side c = " + c + "| Height he = " + ha + "| Content = "
				+ getcontent() + "| Circuit = " + getcircuit();
	}

}
