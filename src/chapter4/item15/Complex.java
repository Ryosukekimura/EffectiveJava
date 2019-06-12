package chapter4.item15;

public final class Complex {
	private final double re;
	private final double im;

	//    public Complex(double re, double im) {
	//        this.re = re;
	//        this.im = im;
	//    }

	private Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public static Complex ValueOf(double re, double im) {
		return new Complex(re, im);
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex subtract(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex multiply(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
	}

	public Complex divide(Complex c) {
		double tmp = c.re * c.re + c.im * c.im;
		return new Complex(
				(re * c.re - im * c.im) / tmp,
				(re * c.im + im * c.re) / tmp);
	}
}
