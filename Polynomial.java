import java.lang.Math;

public class Polynomial {
	double [] poly;

	public Polynomial() {
		this.poly = new double[0];
		}

	public Polynomial(double [] coeff) {
		this.poly = coeff;
		}

	public Polynomial add(Polynomial newPoly) {
		if(this.poly.length > newPoly.poly.length) {
			for (int i = 0; i < newPoly.poly.length; i++) {
				this.poly[i] = this.poly[i] + newPoly.poly[i];
			}
		}
		else {
			for (int i = 0; i < this.poly.length; i++) {
				newPoly.poly[i] = this.poly[i] + newPoly.poly[i];
			}
			this.poly = newPoly.poly;
		}
		return this;
		}

	public double evaluate(double x) {
		double result = 0;
		for (int i = 0; i < this.poly.length; i++) {
			result += this.poly[i] * Math.pow(x, i);
			}
		return result;
		}

	public boolean hasRoot(double x) {
		return this.evaluate(x) == 0;
		}
	}