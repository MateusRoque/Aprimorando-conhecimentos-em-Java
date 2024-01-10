package application;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex colou teu cu com durex");
		list.add("Atecubanos");
		list.add("Civernetico");
		list.add(2, "Maria");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		list.removeIf(x -> x.charAt(0) == 'A');
		
		
		for (String x : list) {
			System.out.println(x);
		}
	}

}
