package SetterInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext cnt=new ClassPathXmlApplicationContext("Beans.xml");
		FootballPlayer obj=cnt.getBean("t1",FootballPlayer.class);
		
		System.out.println(obj.getFootball());
		
		

	}

}
