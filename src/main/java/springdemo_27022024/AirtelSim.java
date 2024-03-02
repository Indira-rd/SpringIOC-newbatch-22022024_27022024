package springdemo_27022024;

public class AirtelSim implements Sim {

	@Override
	public String toString() {
		return "AirtelSim";
	}
	//as we know that sim is a reference variable, that's why when we print sim it prints object address. so i will override tostring for AirtelSim and JioSim class
	
}
