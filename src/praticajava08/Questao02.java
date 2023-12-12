package praticajava08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in)) {
			ArrayList<Integer> lista = new ArrayList<>();
			lista.add(2);
			lista.add(5);
			lista.add(1);
			lista.add(3);
			lista.add(4);
			lista.add(9);
			lista.add(7);
			lista.add(8);
			lista.add(10);
			lista.add(6);
			
			System.out.println("List: ");

			Iterator<Integer> iLista = lista.iterator();
			
			while(iLista.hasNext()) {
				System.out.println(iLista.next());
			}

			System.out.println("\n\nDigite o número que você deseja encontrar: ");
			int numero = leia.nextInt();
			
			if (lista.contains(numero)) {
			    int posicao = lista.indexOf(numero);
			    System.out.println("\nO número " + numero + " está localizado na posição: " + posicao);
			} else {
			    System.out.println("\nO número " + numero + " não foi encontrado!");
			}
		}
	}
}
