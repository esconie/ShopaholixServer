package data;

import java.util.HashSet;

public class Family {
	public Integer id;
	public HashSet<User> users = new HashSet<User>();
	
	public Family(Integer i) {
		id = i;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
}