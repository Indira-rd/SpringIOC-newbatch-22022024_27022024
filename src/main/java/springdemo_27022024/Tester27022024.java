package springdemo_27022024;
//value injection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class Tester27022024 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");//this is to prepare your container
//	}
//}
//now, object is created
//output:- no output bcz we dont haveany print statement here.
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024"></bean>
//</beans>
//there will be empty Mobile27022024 and empty Laptop27022024 classes will be there


//public class Tester27022024 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//		System.out.println(applicationContext.getBean(Mobile27022024.class));
//	}
//}

//package springdemo_27022024;
//
//public class Mobile27022024 {
//	String mobilecolour;
//	String mobileBrand;
//	int mobileRam;
//	public String getMobilecolour() {
//		return mobilecolour;
//	}
//	public void setMobilecolour(String mobilecolour) {
//		this.mobilecolour = mobilecolour;
//	}
//	public String getMobileBrand() {
//		return mobileBrand;
//	}
//	public void setMobileBrand(String mobileBrand) {
//		this.mobileBrand = mobileBrand;
//	}
//	public int getMobileRam() {
//		return mobileRam;
//	}
//	public void setMobileRam(int mobileRam) {
//		this.mobileRam = mobileRam;
//	}
//	@Override
//	public String toString() {
//		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
//				+ mobileRam + "]";
//	}
//}

//package springdemo_27022024;
//
//public class Laptop27022024 {
//
//}

//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024"></bean>
//</beans>

//output:- Mobile27022024 [mobilecolour=null, mobileBrand=null, mobileRam=0]


//public class Tester27022024 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//		System.out.println(applicationContext.getBean(Mobile27022024.class));
//	}
//}
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024"></bean>
//<bean class="springdemo_27022024.Laptop27022024" name="laptop27022024"></bean>
//</beans>
//
//package springdemo_27022024;
//
//public class Laptop27022024 {
//	String laptopColour;
//	int laptopRam;
//	String laptopBrand;
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
//}
//
//package springdemo_27022024;
//
//public class Mobile27022024 {
//	String mobilecolour;
//	String mobileBrand;
//	int mobileRam;
//	public String getMobilecolour() {
//		return mobilecolour;
//	}
//	public void setMobilecolour(String mobilecolour) {
//		this.mobilecolour = mobilecolour;
//	}
//	public String getMobileBrand() {
//		return mobileBrand;
//	}
//	public void setMobileBrand(String mobileBrand) {
//		this.mobileBrand = mobileBrand;
//	}
//	public int getMobileRam() {
//		return mobileRam;
//	}
//	public void setMobileRam(int mobileRam) {
//		this.mobileRam = mobileRam;
//	}
//	@Override
//	public String toString() {
//		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
//				+ mobileRam + "]";
//	}
//	
//}

//output:- error or exception bcz we wont initialize the values of Laptop270202024 class. we need to initialize this bcz here we used constructor injection to inject the values. in this case, if we miss toinject the values then, object itsel will not be created. even we know that application context is eager. even though we are not calling getBean() it will try to create the object. 


//public class Tester27022024 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//		System.out.println(applicationContext.getBean(Mobile27022024.class));
//		System.out.println(applicationContext.getBean(Laptop27022024.class));
//	}
//}
//output:- error or exception bcz we wont initialize the values of Laptop270202024 class. we need to initialize this bcz here we used constructor injection to inject the values. in this case, if we miss toinject the values then, object itsel will not be created. even we know that application context is eager. even though we are not calling getBean() it will try to create the object. 


//public class Tester27022024 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//	System.out.println(applicationContext.getBean(Mobile27022024.class));
//	System.out.println(applicationContext.getBean(Laptop27022024.class));
//}
//}
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024">
//<property name="mobilecolour" value="gold"></property>
//<property name="mobileBrand" value="oneplus"></property>
//<property name="mobileRam" value="12"></property>
//</bean>
//<bean class="springdemo_27022024.Laptop27022024" name="laptop27022024">
//<constructor-arg value="Silver"></constructor-arg>
//<constructor-arg index="2" value="HP"></constructor-arg>
//<constructor-arg index="1" value="1024"></constructor-arg>
//</bean>
//</beans>
//output:-Mobile27022024 [mobilecolour=gold, mobileBrand=oneplus, mobileRam=12]
//		Laptop27022024 [laptopColour=Silver, laptopRam=1024, laptopBrand=HP]




//dependency injection
// only using setter injection
//public class Tester27022024 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//	System.out.println(applicationContext.getBean(Mobile27022024.class));
//	System.out.println(applicationContext.getBean(Laptop27022024.class));
//}
//}

//package springdemo_27022024;
//
//public class AirtelSim implements Sim {
//
//	@Override
//	public String toString() {
//		return "AirtelSim";
//	}
//	//as we know that sim is a reference variable, that's why when we print sim it prints object address. so i will override tostring for AirtelSim and JioSim class
//	
//}
//
//package springdemo_27022024;
//
//public class JioSim implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSim";
//	}
//	
//}
//
//package springdemo_27022024;
//
//public class Laptop27022024 {
//	String laptopColour;
//	int laptopRam;
//	String laptopBrand;
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
//	
//	//dependency injection
//	//take the reference variable of Sim, create constructorid. Remove the constructor and create new constructor
//}
//
//package springdemo_27022024;
//
//public class Mobile27022024 {
//	String mobilecolour;
//	String mobileBrand;
//	int mobileRam;
//	public String getMobilecolour() {
//		return mobilecolour;
//	}
//	public void setMobilecolour(String mobilecolour) {
//		this.mobilecolour = mobilecolour;
//	}
//	public String getMobileBrand() {
//		return mobileBrand;
//	}
//	public void setMobileBrand(String mobileBrand) {
//		this.mobileBrand = mobileBrand;
//	}
//	public int getMobileRam() {
//		return mobileRam;
//	}
//	public void setMobileRam(int mobileRam) {
//		this.mobileRam = mobileRam;
//	}
////	@Override
////	public String toString() {
////		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
////				+ mobileRam + "]";
////	}
//	//dependency injection
////	AirtelSim airtelSim=new AirtelSim();// we can do this but if we do this then we will get the problem of tight coupling. for example if we delete the AirtelSim class then it will wo'nt work. we get error.
//	
//	Sim sim;//reference variable of Sim interface. object we won't inject from here, we tell spring  to inject
//	//i generategetters and setters here
//	public Sim getSim() {
//		return sim;
//	}
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}
//	//i need to remove the previousely generated(override) toString, and ineed to again generate the toString()
//	@Override
//	public String toString() {
//		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
//				+ mobileRam + ", sim=" + sim + "]";
//	}
//	
//	
//}
//
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024">
//<property name="mobilecolour" value="gold"></property>
//<property name="mobileBrand" value="oneplus"></property>
//<property name="mobileRam" value="12"></property>
//<!-- <property name="sim" value="new JioSim()"></property>//not possible. bcz when you write value it will consider it as String
//<property name="sim" value="springdemo_27022024.JioSim27022024"></property>//not possible. bcz when you write value it will consider it as String. if it is a number it will do parseInt(). but it is not possible to convert String to any another object. String is non-primtive. so, we need to do non primitive type casting. so, if String i need to convert it to another type then i need to do upcasting. for example, if i ineed to convert String to Laptop object then i need to do upcasting. to do upcasting there should be inheritance. here , there is no inheritance between Mobile object and String.  String can i inherit? it is a final class ,we cannot inherited. if there is no inheritance, there is no concept of upcasting and downcasting. so, there isno way to convert String to JioSim or String to AirtelSim it isnot possible.  -->
//<property name="sim" ref="AirtelSimRef"></property><!--we do dependency injection with the help of Ref. Ref will inject the object. basically now, inside this variable, AirtelSim object is inserted through spring -->
//</bean>
//<bean name="AirtelSimRef" class="springdemo_27022024.AirtelSim"></bean><!--this will create object for AirtelSim-->
//<bean class="springdemo_27022024.Laptop27022024" name="laptop27022024">
//<constructor-arg value="Silver"></constructor-arg>
//<constructor-arg index="2" value="HP"></constructor-arg>
//<constructor-arg index="1" value="1024"></constructor-arg>
//</bean>
//</beans>
//
//output:-
//Mobile27022024 [mobilecolour=gold, mobileBrand=oneplus, mobileRam=12, sim=AirtelSim]
//Laptop27022024 [laptopColour=Silver, laptopRam=1024, laptopBrand=HP]


//both using setter and constructor injection
//public class Tester27022024 {
//public static void main(String[] args) {
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myconfiguration.xml");
//	System.out.println(applicationContext.getBean(Mobile27022024.class));
//	System.out.println(applicationContext.getBean(Laptop27022024.class));
//}
//}
//
//public class AirtelSim implements Sim {
//
//	@Override
//	public String toString() {
//		return "AirtelSim";
//	}
//	//as we know that sim is a reference variable, that's why when we print sim it prints object address. so i will override tostring for AirtelSim and JioSim class
//	
//}
//
//package springdemo_27022024;
//
//public class HardDiskDrives implements Storage{
//
//	@Override
//	public String toString() {
//		return "HardDiskDrives";
//	}
//	
//
//}
//
//package springdemo_27022024;
//
//public class JioSim implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSim";
//	}
//	
//}
//
//package springdemo_27022024;
//
//public class Laptop27022024 {
//	String laptopColour;
//	int laptopRam;
//	String laptopBrand;
////	public Laptop27022024(String laptopColour, int laptopRam, String laptopBrand) {
////		super();
////		this.laptopColour = laptopColour;
////		this.laptopRam = laptopRam;
////		this.laptopBrand = laptopBrand;
////	}
////	@Override
////	public String toString() {
////		return "Laptop27022024 [laptopColour=" + laptopColour + ", laptopRam=" + laptopRam + ", laptopBrand="
////				+ laptopBrand + "]";
////	}
//	
//	//dependency injection
//	//take the reference variable of Sim(but i created for Storage not for Sim), create constructorid. Remove the constructor and create new constructor
//	Storage storage;
//public Laptop27022024(String laptopColour, int laptopRam, String laptopBrand, Storage storage) {
//	super();
//	this.laptopColour = laptopColour;
//	this.laptopRam = laptopRam;
//	this.laptopBrand = laptopBrand;
//	this.storage = storage;
//}
//@Override
//public String toString() {
//	return "Laptop27022024 [laptopColour=" + laptopColour + ", laptopRam=" + laptopRam + ", laptopBrand=" + laptopBrand
//			+ ", storage=" + storage + "]";
//}
//}
//
//package springdemo_27022024;
//
//public class Mobile27022024 {
//	String mobilecolour;
//	String mobileBrand;
//	int mobileRam;
//	public String getMobilecolour() {
//		return mobilecolour;
//	}
//	public void setMobilecolour(String mobilecolour) {
//		this.mobilecolour = mobilecolour;
//	}
//	public String getMobileBrand() {
//		return mobileBrand;
//	}
//	public void setMobileBrand(String mobileBrand) {
//		this.mobileBrand = mobileBrand;
//	}
//	public int getMobileRam() {
//		return mobileRam;
//	}
//	public void setMobileRam(int mobileRam) {
//		this.mobileRam = mobileRam;
//	}
////	@Override
////	public String toString() {
////		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
////				+ mobileRam + "]";
////	}
//	//dependency injection
////	AirtelSim airtelSim=new AirtelSim();// we can do this but if we do this then we will get the problem of tight coupling. for example if we delete the AirtelSim class then it will wo'nt work. we get error.
//	
//	Sim sim;//reference variable of Sim interface. object we won't inject from here, we tell spring  to inject
//	//i generategetters and setters here
//	public Sim getSim() {
//		return sim;
//	}
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}
//	//i need to remove the previousely generated(override) toString, and ineed to again generate the toString()
//	@Override
//	public String toString() {
//		return "Mobile27022024 [mobilecolour=" + mobilecolour + ", mobileBrand=" + mobileBrand + ", mobileRam="
//				+ mobileRam + ", sim=" + sim + "]";
//	}
//	
//	
//}
//
//package springdemo_27022024;
//
//public interface Sim {
//
//}
//
//package springdemo_27022024;
//
//public class SolidStateDrives implements Storage{
//
//	@Override
//	public String toString() {
//		return "SolidStateDrives";
//	}
//	
//}
//
//
//package springdemo_27022024;
//
//public interface Storage {
//	
//}

//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_27022024.Mobile27022024" name="mobile27022024">
//<property name="mobilecolour" value="gold"></property>
//<property name="mobileBrand" value="oneplus"></property>
//<property name="mobileRam" value="12"></property>
//<!-- <property name="sim" value="new JioSim()"></property>//not possible. bcz when you write value it will consider it as String
//<property name="sim" value="springdemo_27022024.JioSim27022024"></property>//not possible. bcz when you write value it will consider it as String. if it is a number it will do parseInt(). but it is not possible to convert String to any another object. String is non-primtive. so, we need to do non primitive type casting. so, if String i need to convert it to another type then i need to do upcasting. for example, if i ineed to convert String to Laptop object then i need to do upcasting. to do upcasting there should be inheritance. here , there is no inheritance between Mobile object and String.  String can i inherit? it is a final class ,we cannot inherited. if there is no inheritance, there is no concept of upcasting and downcasting. so, there isno way to convert String to JioSim or String to AirtelSim it isnot possible.  -->
//<property name="sim" ref="AirtelSimRef"></property><!--we do dependency injection with the help of Ref. Ref will inject the object. basically now, inside this variable, AirtelSim object is inserted through spring -->
//</bean>
//<bean name="AirtelSimRef" class="springdemo_27022024.AirtelSim"></bean><!--this will create object for AirtelSim-->
//<bean class="springdemo_27022024.Laptop27022024" name="laptop27022024">
//<constructor-arg value="Silver"></constructor-arg>
//<constructor-arg index="2" value="HP"></constructor-arg>
//<constructor-arg index="1" value="1024"></constructor-arg>
//<constructor-arg index="3" ref="SolidStateDrivesRef"></constructor-arg>
//</bean>
//<bean class="springdemo_27022024.SolidStateDrives" name="SolidStateDrivesRef"></bean>
//</beans>

//output:-
//Mobile27022024 [mobilecolour=gold, mobileBrand=oneplus, mobileRam=12, sim=AirtelSim]
//Laptop27022024 [laptopColour=Silver, laptopRam=1024, laptopBrand=HP, storage=SolidStateDrives]
