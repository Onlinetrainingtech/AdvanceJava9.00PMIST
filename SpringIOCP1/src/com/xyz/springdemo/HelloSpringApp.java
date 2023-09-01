package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach t1=context.getBean("my1",Coach.class);
		
		Coach t2=context.getBean("my2",Coach.class);
		
		System.out.println(t1.getDailyWorkout());
		System.out.println(t2.getDailyWorkout());
		
		context.close();

	}

}
