package praticajava08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Questao04 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			Set<Integer> setInteiros = new HashSet<>();
			setInteiros.add(2);
			setInteiros.add(5);
			setInteiros.add(1);
			setInteiros.add(3);
			setInteiros.add(4);
			setInteiros.add(9);
			setInteiros.add(7);
			setInteiros.add(8);
			setInteiros.add(10);
			setInteiros.add(6);
			
			System.out.println("\nList: ");

			Iterator<Integer> isetInteiros = setInteiros.iterator();

			while (isetInteiros.hasNext()) {
				System.out.println(isetInteiros.next());
			}
			
			System.out.println("\nDigite o número que você deseja encontrar: ");
			int numero = leia.nextInt();
			
			if (setInteiros.contains(numero)) {
			    System.out.println("\nO número " + numero + " está presente no conjunto!");
			} else {
			    System.out.println("\nO número " + numero + " não foi encontrado!");
			}
		}
	}

}
