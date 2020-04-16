
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero = 4;
        System.out.printf("%nEl numero %d ", numero);
        System.out.print(numeroPrimo(numero, 2)?"es un número primo.":"no es un número primo.");
    }
     
    private static boolean numeroPrimo(int num, int divisor){
        if(num/2 < divisor){
            return true;
        } else {
            if(num%divisor==0){
                return false;
            } else {
                return numeroPrimo(num, divisor+1);
            }
        }
    }
}
