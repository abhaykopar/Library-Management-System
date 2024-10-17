package oop;

public class Faculty extends User {
	public Faculty(String name,int uid) {
		super(name,uid);
	}
	
	public String toString() {
		return "faculty - "+super.toString();
	}
}
