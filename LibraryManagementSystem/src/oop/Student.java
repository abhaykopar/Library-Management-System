package oop;

public class Student extends User  {
	Student(String name,int uid){
		super(name,uid);
	}
	
	public String toString() {
		return "student - "+super.toString();
	}
}
