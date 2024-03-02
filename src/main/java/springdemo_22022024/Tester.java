package springdemo_22022024;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//this is a tester object
//to test we use this
public class Tester {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myconfiguration.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Mobile mobile=beanFactory.getBean(Mobile.class);
		System.out.println(mobile);  //springdemo_22022024.Mobile@54c562f7
	}
}
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="springdemo_22022024.Mobile"></bean>
//</beans>