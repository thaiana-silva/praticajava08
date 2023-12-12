package praticajava08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in)) {
	ArrayList<String> cores = new ArrayList<>();
	
	System.out.println("Digite 5 cores:");

	for (int indice = 0; indice < 5; indice++) {
	    String cor = leia.nextLine();
	    cores.add(cor);
	}

	System.out.println("\nListar todas as cores:");
	for (String cor : cores) {
	    System.out.println(cor);
	}

	Collections.sort(cores);

	System.out.println("\nOrdenar as cores:");
	for (String cor : cores) {
	    System.out.println(cor);
	}
}

	}

}
