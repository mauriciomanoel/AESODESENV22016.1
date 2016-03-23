package br.aeso.aula11.exemplo;
import java.util.LinkedList;
import java.util.Queue;
public class ExemploColecoes9 {
	public static void main(String[] args){
		Queue fila = new LinkedList();
		fila.add("M");
		fila.add("A");
		fila.add("U");
		System.out.println(fila.toString());
		System.out.println(fila.poll());
		fila.peek()
		System.out.println(fila.toString());
	}
}






