package project.seventh.patterns;

public class VaccinatedAnimal extends AnimalDecorator {
	public VaccinatedAnimal(Animal z) {
		super(z);
	}
	public void describe() {
		this.anim.describe();
		this.vaccinated(this.anim);
	} 
	private void vaccinated(Animal z) {
		System.out.println("\tOva zivotinja je pelcovana.");
	}

}
