package data;

import java.util.HashSet;

public class Family {
	HashSet<User> users = new HashSet<User>();
	Integer id;
	
	public Family(Integer i) {
		id = i;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
}