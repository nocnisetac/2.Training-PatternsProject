package project.seventh.patterns;

import java.io.IOException;
import java.util.Calendar;

public class PatternsTest {

	public static void flyweightTest() {
		System.out.println(" *** FLYWEIGHT pattern demo ***\n"
				+ "OPIS: Sistem treba da, na osnovu ulazne DNK-a sekvence, generise predstavu iste u liku\n"
				+ "niza instanci tipa Baze, koji mogu biti Purinske(i to Adenin i Guanin) i Pirimidinske\n"
				+ "(i to Citozin i Timin). Da bi izbegli kreiranje nepotrebno velikog broja istih objekata,\n"
				+ "koristimo samo po jedan primerak za svaku bazu, a koje po stvaranju cuvamo u odgovarajucoj\n"
				+ "hes tabeli. Ovo ima smisla jer unutrasnje info (o samim bazama) cuvaju instance baza, a\n"
				+ "spoljasnje info (pozicija baze u sekvenci) cuvace onaj ko prihvati sekvencu. U radu sa DNK-a\n"
				+ "sekvencama sa duzinom od vise hiljada (pa i vise desetina hiljada) clanova ovo i te kako ima\n"
				+ "smisla. Inace, instance Baze se kreiraju po sablonu Fabrika.\n");
		String dna = "AGATACGATATATAC";
		System.out.println("\tUlazna DNK-a sekvenca: " + dna);
		for (int i = 0; i < dna.length(); i++) {
			Base bs = (Base) BaseFactory.getBase(Character.toString(dna.charAt(i)));
			bs.print();
		}
	}

	public static void decoratorTest() {
		System.out.println(" *** DECORATOR pattern demo ***\n"
				+ "OPIS:\nU sistem koji opisuje zivotinje jednog zoo vrta, dodajemo novu osobinu: info o pelcovanju.");
		Dog dog = new Dog();
		VaccinatedAnimal vdog = new VaccinatedAnimal(new Dog());
		VaccinatedAnimal vparrot = new VaccinatedAnimal(new Parrot());
		System.out.println("* Pas kod nas...");
		dog.describe();
		System.out.println("* Pelcovani pas kod nas...");
		vdog.describe();
		System.out.println("* Pelcovani papagaj ko zmaj...");
		vparrot.describe();
	}

	public static void singletonTest() {
		System.out.println(" *** SINGLETON pattern demo ***\n"
				+ "OPIS:\nSvaka instanca klase Unique dobija jedinstveni identifikaciioni broj pri stvaranju.\n"
				+ "Nekoliko puta cemo zahtevati instancu klase Unique i ispisivati njen id...");
		for (int i = 0; i < 3; i++) {
			System.out.println("\t" + (i + 1) + " put: id = " + Unique.getUniqueObj().getId());
		}
	}

	public static void factoryTest() {
		System.out.println(" *** FACTORY pattern demo ***\n"
				+ "OPIS:\nInfo-servis reaguje razlicito u zavisnosti od doba dana i dana u nedelji \n"
				+ "kada se korisnik javio. Ako se javio radnim danom izmedju sest ujutru i cetiri popodne\n"
				+ "bice mu dodeljen neko od dezurnih operatera. Ako se javi van radnog vremena usluzice ga\n"
				+ "sluzba za hitne intervencije, a ako se javio u vreme vikenda, reagovace govorni automat.");
		OnDutyFactory odf = new OnDutyFactory();

		OnDuty od = odf.getOnDuty();
		od.getInfo();

	}

	public static void main(String[] args) {
		char entered = 'i';
		System.out.println("Pattern testing:\n" + "\t- to test Factory pattern press 1\n"
				+ "\t- to test Singleton pattern press 2\n" + "\t- to test Decorator (Wrapper) pattern press 3\n"
				+ "\t- to test Flyweight pattern press 4\n" + "\t- to EXIT press 0");
		try {
			entered = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (entered) {
		case '0':
			System.out.println("Demo exit. Bye-bye.");
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
		case '4':
			PatternsTest.flyweightTest();
			break;
		default:
			System.out.println("There is no such a pattern.");
		}
	}

}
