package com.String.Operations;

public class DemoToString 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(45, "Shubham");
//		System.out.println(s1.rollno);	
//		System.out.println(s1.sname);
		System.out.println(s1);//.toString());
	}
}

class Student //extends Object
{
	int rollno;
	String sname;
	
	public Student (int rollno,String sname)
	{
		this.rollno = rollno;
		this.sname = sname;
	}
	@Override
	public String toString()
	{
		return rollno +" : "+sname;
	}
}
