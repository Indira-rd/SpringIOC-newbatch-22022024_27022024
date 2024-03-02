package springdemo_27022024;

public class Mobile27022024 {
	String mobilecolour;
	String mobileBrand;
	int mobileRam;
	public String getMobilecolour() {
		return mobilecolour;
	}
	public void setMobilecolour(String mobilecolour) {
		this.mobilecolour = mobilecolour;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public int getMobileRam() {
		return mobileRam;
	}
	public void setMobileRam(int mobileRam) {
		this.mobileRam = mobileRam;
	}
//	@Override
//	public String toString() {
//		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
//				+ mobileRam + "]";
//	}
	//dependency injection
//	AirtelSim airtelSim=new AirtelSim();// we can do this but if we do this then we will get the problem of tight coupling. for example if we delete the AirtelSim class then it will wo'nt work. we get error.
	
	Sim sim;//reference variable of Sim interface. object we won't inject from here, we tell spring  to inject
	//i generategetters and setters here
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	//i need to remove the previousely generated(override) toString, and ineed to again generate the toString()
	@Override
	public String toString() {
		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
				+ mobileRam + ", sim=" + sim + "]";
	}
	
	
}
