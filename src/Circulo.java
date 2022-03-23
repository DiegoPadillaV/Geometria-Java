import java.util.Scanner;

public class Circulo {
	
	static Scanner leer = new Scanner(System.in);
	
	private double diametro;
	
	public Circulo() {
	}

	public Circulo(double diametro) {
		this.diametro = diametro;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}



	public double radioCirculoMedianteDiametro() {
		/*
		 * System.out.println("Ingrese diametro del circulo:"); double diametro =
		 * leer.nextDouble(); double radio = diametro / 2;
		 * System.out.println("El radio del circulo es: " + radio);
		 * 
		 * return radio;
		 */
		return this.diametro / 2;
	}
	
	public double perimetroCirculo() {
		/*
		 * System.out.println("Ingrese radio del circulo:"); double radio =
		 * leer.nextDouble(); double perimetro = 2 * Math.PI * radio;
		 * System.out.println("El perimetro del circulo es: " + perimetro);
		 * 
		 * return perimetro;
		 */
		return Math.PI * this.diametro;
	}
	
	public double areaCirculo() {
		/*
		 * System.out.println("Ingrese radio del circulo:"); double radio =
		 * leer.nextDouble(); double areaCirculo = Math.PI * Math.pow(radio, 2);
		 * System.out.println("El area del circulo es: " + areaCirculo);
		 * 
		 * return areaCirculo;
		 */
		double radio = radioCirculoMedianteDiametro();
		return Math.PI * Math.pow(radio, 2);
	}
}
