package project.seventh.patterns;

public abstract class ZivDecorator implements Zivotinja {
	
	protected Zivotinja ziv;
	public ZivDecorator(Zivotinja ziv) {
		this.ziv=ziv;
	}

	@Override
	public void opis() {
		this.ziv.opis();
	}

}
