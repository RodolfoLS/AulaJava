package exemplo;

public class ExemploFibonacciVetor {
	public static void main(String[] args) {
		
		int vFibo[] = new int[10];
		
		vFibo[0] = 1;
		vFibo[1] = vFibo[0];
		vFibo[2] = vFibo[0] + vFibo[1];
		
		for (int i = 3; i < vFibo.length; i++) {
			vFibo[i] = vFibo[i-1] + vFibo[i-2];
		}
		
		for (int f : vFibo) {
			System.out.print(f + ", ");
		}
	}
}
