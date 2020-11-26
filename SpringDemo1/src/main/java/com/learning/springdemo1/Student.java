package com.learning.springdemo1;

public class Student {
	private int age;
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Student()
	{
		System.out.println("Student Object is created");
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age assigned");
	}

	
	
	public void study()
	{
		System.out.println("I am learning");
		laptop.addLaptop();
	}

}
