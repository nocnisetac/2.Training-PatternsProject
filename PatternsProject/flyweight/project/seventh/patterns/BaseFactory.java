package project.seventh.patterns;

import java.util.HashMap;

public class BaseFactory {
	private static final HashMap<String, Base> baseMap = new HashMap();
	
	public static Base getBase(String b) {
		Base baza = (Base)baseMap.get(b);
		if(baza==null) {
			switch (b) {
			case "a": case "A":
				baza=new Adenine();
				break;
			case "c": case "C":
				baza=new Cytosine();
				break;	
			case "g": case "G":
				baza=new Guanine();
				break;
			case "t": case "T":
				baza=new Thymine();
				break;	
			}
			baseMap.put(b, baza);
			System.out.print("Kreirana je nova baza:");
		}
		else System.out.print("Baza vec postoji     :");
		return baza;
	}
}
