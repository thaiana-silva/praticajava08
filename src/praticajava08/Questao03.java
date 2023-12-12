package praticajava08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Questao03 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in)) {
			Set<Integer> setInteiros = new HashSet<>();

			System.out.println("Digite 10 valores inteiros para o set:");

			for (int indice = 0; indice < 10; indice++) {
			    int valor = leia.nextInt();
			    setInteiros.add(valor);
			}

			System.out.println("\nListar dados do Set:");
			Iterator<Integer> iterator = setInteiros.iterator();
			while (iterator.hasNext()) {
			    System.out.println(iterator.next());
			}
		}

	}

}
