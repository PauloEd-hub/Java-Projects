package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriandoListas {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		
		
		list.add("Maria");
		list.add("Otávio");
		list.add("Belo");
		list.add("João");
		list.add("Mario");
		
		//Adicionando colocando posiçao na List
		list.add(2, "Paulo");
		
		//Remove alguma coisa da lista
		list.remove(1);
		
		// Ver tamanho da lista
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);

		}
		System.out.println("-----------------------------------------");
		System.out.println("Index of Bob: " +  list.indexOf("Mario") );
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'O').collect(Collectors.toList());	
	for(String x : result) {
		System.out.println(x);
	}
	}
}