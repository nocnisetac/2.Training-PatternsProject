package project.seventh.patterns;

import java.util.Calendar;

public class WorkingEmergency implements OnDuty {

	@Override
	public void getInfo() {
		Calendar c = Calendar.getInstance();
		System.out.println("\n***  Datum: "+c.get(Calendar.DATE)+":"+c.get(Calendar.MONTH)+":"+c.get(Calendar.YEAR));
		System.out.println("***  Vreme: "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		System.out.println("***  Dobili ste Info-centar, prebaceni ste na hitnu sluzbu...");
	}

}
