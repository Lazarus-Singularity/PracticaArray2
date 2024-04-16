package arraysmirrored;

public class ArraysMirrored {

	public static void main(String[] args) {

		int numero[] = {1, 2, 3, 4, 5};

		int aux[] = new int[numero.length];
		

		for (int i = numero.length - 1, j = 0; i >= 0; i--, j++) {

			aux[j] = numero[i];
			
			System.out.print(aux[j] );
			System.out.print(" ");

		}

	}

}
