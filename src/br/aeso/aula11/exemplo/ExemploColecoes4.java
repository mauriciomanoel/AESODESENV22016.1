package br.aeso.aula11.exemplo;
import java.util.TreeSet;
public class ExemploColecoes4 {
	public static void main(String[] args) {
		TreeSet colecaoSet = new TreeSet<>();
		colecaoSet.add("M");
		colecaoSet.add("A");
		colecaoSet.add("U");
		colecaoSet.add("U");
		System.out.println(colecaoSet.contains("U"));
		colecaoSet.remove("M");
		System.out.println(colecaoSet.toString());
	}
}


