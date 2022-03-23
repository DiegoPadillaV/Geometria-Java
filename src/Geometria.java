import java.util.Scanner;

public class Geometria {
    
	static Scanner leer = new Scanner(System.in);
	private final static short OPCION_MENU_AREA_RECTANGULO = 1;
	private final static short OPCION_MENU_RADIO_CIRCULO = 2;
	private final static short OPCION_MENU_PERIMETRO_CIRCULO = 3;
	private final static short OPCION_MENU_AREA_CIRCULO = 4;
	private final static short OPCION_MENU_SALIR = 5;
	
	private static short opcionSeleccionada;

	public static void main(String[] args) {

		do {
			menu();
			switch(opcionSeleccionada) { 
			case OPCION_MENU_AREA_RECTANGULO:
				areaRectangulo();
				break; 
			case OPCION_MENU_RADIO_CIRCULO:
				radioCirculoMedianteDiametro();
				break; 
			case OPCION_MENU_PERIMETRO_CIRCULO:
				perimetroCirculo();
				break; 
			case OPCION_MENU_AREA_CIRCULO:
				areaCirculo();
				break; 
			} 
		}while (opcionSeleccionada != OPCION_MENU_SALIR);
	}

	private static void areaRectangulo() {
		
		System.out.println("Por favor ingrese la base del rectangulo:");
		double base = leer.nextDouble();
		
		System.out.println("Por favor ingrese la altura del rectangulo:");
		double altura = leer.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		
		double areaRectangulo = rectangulo.areaRectangulo();
		
		System.out.printf("El area del rectangulo es %f %n%n", areaRectangulo);
	}
	
	private static void radioCirculoMedianteDiametro() {
		
		System.out.println("Por favor ingrese diametro del circulo:");
		double diametro = leer.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		
		double radioCirculo = circulo.radioCirculoMedianteDiametro();
		
		System.out.printf("El radio del circulo es %f %n%n", radioCirculo);
	}
	
	private static void perimetroCirculo() {
		
		System.out.println("Por favor ingrese diametro del circulo:");
		double diametro = leer.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		
		double perimetroCirculo = circulo.perimetroCirculo();
		
		System.out.printf("El perimetro del circulo es %f %n%n", perimetroCirculo);
	}
	
	private static void areaCirculo() {
		
		System.out.println("Por favor ingrese diametro del circulo:");
		double diametro = leer.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		
		double areaCirculo = circulo.areaCirculo();
		
		System.out.printf("El area del circulo es %f %n%n", areaCirculo);
	}

	private static short menu() {
		System.out.println("\nMENU GEOMETRIA\n===================\n");
		System.out.println("1. Area de un rectangulo");
		System.out.println("2. Radio de un circulo a partir del diametro");
		System.out.println("3. Perimetro del circulo");
		System.out.println("4. Area de un circulo");
		System.out.println("5. Salir");

		System.out.println("\nPor favor digite la opcion deseada:");

		opcionSeleccionada = leer.nextShort();

		return opcionSeleccionada;
	}


}
