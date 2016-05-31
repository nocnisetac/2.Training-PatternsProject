package project.seventh.patterns;

import java.io.IOException;
import java.util.Calendar;

public class PatternsTest {
	public static void decoratorTest(){
		System.out.println(" *** Decorator pattern demo ***\n"
				+ "OPIS:\nU sistem koji opisuje zivotinje jednog zoo vrta, dodajemo novu osobinu: info o pelcovanju.");
		Pas pas = new Pas();
		PelcovanaZivotinja ppas = new PelcovanaZivotinja(new Pas());
		PelcovanaZivotinja ppapagaj = new PelcovanaZivotinja(new Papagaj());
		System.out.println("* Pas kod nas...");
		pas.opis();
		System.out.println("* Pelcovani pas kod nas...");
		ppas.opis();
		System.out.println("* Pelcovani papagaj kod nas...");
		ppapagaj.opis();
	}
	public static void singletonTest(){
		System.out.println(" *** Singleton pattern demo ***\n"
				+ "OPIS:\nSvaka instanca klase Unique dobija jedinstveni identifikaciioni broj pri stvaranju.\n"
				+ "Nekoliko puta cemo zahtevati instancu klase Unique i ispisivati njen id...");
		for(int i=0;i<3;i++) {
			System.out.println("\t"+(i+1)+" put: id = "+Unique.getUniqueObj().getId());
		}
	}

	public static void factoryTest(){
		System.out.println(" *** Factory pattern demo ***\n"
				+ "OPIS:\nInfo-servis reaguje razlicito u zavisnosti od doba dana i dana u nedelji \n"
				+ "kada se korisnik javio. Ako se javio radnim danom izmedju sest ujutru i cetiri popodne\n"
				+ "bice mu dodeljen neko od dezurnih operatera. Ako se javi van radnog vremena usluzice ga\n"
				+ "sluzba za hitne intervencije, a ako se javio u vreme vikenda, reagovace govorni automat.");
		OnDutyFactory odf = new OnDutyFactory();
		
		OnDuty od = odf.getOnDuty();
		od.getInfo();
		
	}

	public static void main(String[] args) {

		System.out.println("Patern testing:\n"
				+ "\t- to test Factory pattern press 1\n"
				+ "\t- to test Singleton pattern press 2\n"
				+ "\t- to test Decorator (Wrapper) pattern press 3");
		char entered = '0';
		try {
			entered =(char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (entered) {
		case '0':
			break;
		case '1':
			PatternsTest.factoryTest();
			break;
		case '2':
			PatternsTest.singletonTest();
			break;
		case '3':
			PatternsTest.decoratorTest();
			break;
		default:
			System.out.println("There is no such a pattern.");
	}
	}

}
