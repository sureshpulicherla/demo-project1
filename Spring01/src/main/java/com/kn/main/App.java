package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;
import com.kn.bean.Laptop2;
import com.kn.bean.Student;
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cf = new ClassPathXmlApplicationContext("application-context.xml");
		Student s = (Student) cf.getBean("s1");
	
		Laptop lap = (Laptop) cf.getBean("laptop");
		System.out.println("Laptop 1 -----> "+lap);
		
		Laptop2 lap2 = (Laptop2) cf.getBean("laptop2");
		System.out.println("Laptop 2 -----> "+lap2);
		
		
		
		
	}
}
