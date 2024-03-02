package springdemo_27022024;

public class Laptop27022024 {
	String laptopColour;
	int laptopRam;
	String laptopBrand;
//	public Laptop27022024(String laptopColour, int laptopRam, String laptopBrand) {
//		super();
//		this.laptopColour = laptopColour;
//		this.laptopRam = laptopRam;
//		this.laptopBrand = laptopBrand;
//	}
//	@Override
//	public String toString() {
//		return "Laptop27022024 [laptopColour=" + laptopColour + ", laptopRam=" + laptopRam + ", laptopBrand="
//				+ laptopBrand + "]";
//	}
	
	//dependency injection
	//take the reference variable of Sim(but i created for Storage not for Sim), create constructorid. Remove the constructor and create new constructor
	Storage storage;
public Laptop27022024(String laptopColour, int laptopRam, String laptopBrand, Storage storage) {
	super();
	this.laptopColour = laptopColour;
	this.laptopRam = laptopRam;
	this.laptopBrand = laptopBrand;
	this.storage = storage;
}
@Override
public String toString() {
	return "Laptop27022024 [laptopColour=" + laptopColour + ", laptopRam=" + laptopRam + ", laptopBrand=" + laptopBrand
			+ ", storage=" + storage + "]";
}
}
