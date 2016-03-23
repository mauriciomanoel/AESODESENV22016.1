package br.aeso.aula09.exemplo;
import java.util.ArrayList;
public class ExemploExcecao3 {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		int a;
		lista.add("Mauricio");
		lista.add(12.45);
		a = lista.get(0);
		System.out.println(a);
	}
}
