package com.learning.springdemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		//XML Based Configuration file 
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springconfig.xml"));
		
		
		//using application context for XML based Configuration File 
		//Note: XML File should be in class path 
		ApplicationContext factory = new ClassPathXmlApplicationContext("springconfig.xml");
		
		//bean created in springconfig.xml file bean id is stu1
		Student obj1 =(Student)factory.getBean("stu1");
		obj1.study();
		obj1.age=20;
		System.out.println("Age of Obj1 is :"+obj1.age);
		
		Student obj2 =(Student)factory.getBean("stu1");
		obj2.study();
		System.out.println("Age of Obj2 is :"+obj2.age);
		
		//obj2 will also pring age as 20 as Object is created only 1 i.e stu1 referneces are two obj1 & obj 2
		//Spring Container is creating only one object (stu1) --This is known as Singleton pattern 
	}

}
