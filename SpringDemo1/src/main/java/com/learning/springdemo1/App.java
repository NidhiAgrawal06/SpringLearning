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
		Student obj =(Student)factory.getBean("stu1");
		 
		obj.study();
	}

}
