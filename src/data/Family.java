package data;

import java.util.HashSet;

public class Family {
	public String id;
	public HashSet<User> users = new HashSet<User>();
	
	public Family(String i) {
		id = i;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
}