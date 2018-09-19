import java.util.Scanner;
import java.lang.Math;

public class NumCompl{
	public double real;
	public double img;

	public NumCompl(){}

	public NumCompl(double real, double img)
	{
		this.real = real;
		this.img = img;
	}

	public static NumCompl sumar (NumCompl a, NumCompl b)
	{
		NumCompl c = new NumCompl();
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		return c;
	}

	public static NumCompl restar (NumCompl a, NumCompl b)
	{
		NumCompl c = new NumCompl();
		c.real = a.real - b.real;
		c.img = a.img - b.img;
		return c; 
	}

	public static NumCompl multi (NumCompl a, NumCompl b)
	{
		NumCompl c = new NumCompl();
		c.real = (a.real * b.real) - (a.img * b.img);
		c.img = (a.real * b.img) + (a.img * b.real);
		return c;
	}

	static public NumCompl divi (NumCompl a, NumCompl b)
	{
		NumCompl c = new NumCompl();
		c.real= (a.real*b.real + a.img*b.img)/Math.pow(b.real,2.0)+Math.pow(b.img,2.0);
		c.img = (a.img*b.real - a.real*b.img)/Math.pow(b.real,2.0)+Math.pow(b.img,2.0);
		return c;
	}

}