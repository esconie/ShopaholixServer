package data;

import java.util.List;

public class Family {
	List<User> users;
	Integer id;
	
	public Family(Integer i) {
		id = i;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
}