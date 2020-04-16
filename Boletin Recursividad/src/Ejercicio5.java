
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(par(2)?"Es un número par.":"no es un número par.");

	}
	private static boolean par(int num) {
        if(num == 0)
            return true;
        else if (num == 1)
            return false;
        else 
            return par(num-2);
	}
    
}
