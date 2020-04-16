
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String cadena = "atatap";
	System.out.println("la cadena del reves seria " + obtenerReverso(cadena, (cadena.length()-1)));
		
		
	
	}

	private static String obtenerReverso(String cadena, int pos) {
		
		if (pos < 0)
		
			return "";
		else
			return cadena.charAt(pos) + obtenerReverso(cadena, pos-1);
		
	}
	
	
}
