package data;

import java.sql.Time;

public class MemberUpdate extends Update {
	Family family;
	User user;
	boolean add;
	
	public MemberUpdate(Family f, User u, boolean a, Time t) {
		family = f;
		user = u;
		add = a;
		time = t;
	}
}
