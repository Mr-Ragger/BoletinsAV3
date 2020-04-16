
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 6;
		int n2 = 12;
		
		System.out.println("El producto de " + n1 + " por " + n2 + " es " + producto(n1, n2));
		
		
	}

	private static int producto(int n1, int n2) {
		// TODO Auto-generated method stub
		if (n2 == 1)
			return n1;
		else
			return n1 + producto(n1, n2-1);
	}

}
