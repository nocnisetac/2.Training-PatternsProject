package project.seventh.patterns;

public class Unique {
	private static int idS=0;
	private int id ;
	private static Unique instance =null;
	private Unique() {
		id = idS++;
	}
	public static Unique getUniqueObj() {
		if(instance==null)  return instance = new Unique(); 
		else return instance;
	}
	public int getId() {
		return id;
	}
}
