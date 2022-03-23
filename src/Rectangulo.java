import java.util.Scanner;

public class Rectangulo {

	static Scanner leer = new Scanner(System.in);

	private double base;
	private double altura;

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double areaRectangulo() {
		/*
		 * System.out.println("Ingrese la base:"); double base = leer.nextDouble();
		 * System.out.println("Ingrese la altura:"); double altura = leer.nextDouble();
		 * double area = base * altura;
		 * 
		 * System.out.println("El area del rectangulo es: " + area); return area;
		 */
		
		return this.base * this.altura;
	}

}
