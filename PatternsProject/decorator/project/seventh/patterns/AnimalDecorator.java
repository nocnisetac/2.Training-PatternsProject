package project.seventh.patterns;

public abstract class AnimalDecorator implements Animal {
	
	protected Animal anim;
	public AnimalDecorator(Animal anim) {
		this.anim=anim;
	}

	@Override
	public void describe() {
		this.anim.describe();
	}

}
