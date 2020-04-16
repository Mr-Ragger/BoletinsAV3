
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int exponente = 12;
		
		System.out.println("la pontencia de " + base + " elevado a " + exponente + " es " + potencia(base, exponente));
		
		
	}

	private static int potencia(int base, int exponente) {
		// TODO Auto-generated method stub
		if (exponente == 0)
			return 1;
		else
			return base * potencia(base, exponente-1);
	}

}
