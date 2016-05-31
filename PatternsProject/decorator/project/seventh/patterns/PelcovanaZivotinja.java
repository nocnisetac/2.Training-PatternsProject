package project.seventh.patterns;

public class PelcovanaZivotinja extends ZivDecorator {
	public PelcovanaZivotinja(Zivotinja z) {
		super(z);
	}
	public void opis() {
		this.ziv.opis();
		this.pelcovana(this.ziv);
	} 
	private void pelcovana(Zivotinja z) {
		System.out.println("\tOva zivotinja je pelcovana.");
	}

}
