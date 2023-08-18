package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach1=context.getBean("myCoach1",Coach.class);
		
		Coach theCoach2=context.getBean("myCoach2",Coach.class);
		
		System.out.println(theCoach1.getDailyWorkOut());
		
		System.out.println(theCoach2.getDailyWorkOut());
		
		context.close();

	}

}
