package br.aeso.aula11.exemplo;

import java.util.ArrayList;
import java.util.List;

public class ExemploColecoes16 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		List<String> lista = new ArrayList<String>();
		lista.add("um");
		lista.add("três");
		lista.add("quatro");
		//lista.add(2); -> geraria erro de compilação
		lista.add(1, "dois");
		String x = lista.get(0); //sem cast!
		System.out.println(x);
		lista.remove(2);
		for(String i : lista)
		System.out.print(i + " ");
	}

}
