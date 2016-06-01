package project.seventh.patterns;

import java.util.HashMap;

public class FabrikaBaza {
	private static final HashMap<String, Baze> mapaBaza = new HashMap();
	
	public static Baze dohvatiBazu(String b) {
		Baze baza = (Baze)mapaBaza.get(b);
		if(baza==null) {
			switch (b) {
			case "a": case "A":
				baza=new Adenin();
				break;
			case "c": case "C":
				baza=new Citozin();
				break;	
			case "g": case "G":
				baza=new Guanin();
				break;
			case "t": case "T":
				baza=new Timin();
				break;	
			}
			mapaBaza.put(b, baza);
			System.out.print("Kreirana je nova baza:");
		}
		else System.out.print("Baza vec postoji     :");
		return baza;
	}
}
