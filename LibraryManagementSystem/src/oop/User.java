package oop;

public class User {
	private String name;
	private int uid;
	
	public User(String name,int uid) {
		this.name=name;
		this.uid=uid;
	}
	
	public String getName() {
		return name;
	}
	public int getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", uid=" + uid + "]";
	}
	
	
}
