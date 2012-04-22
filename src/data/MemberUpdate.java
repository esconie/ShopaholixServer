package data;

import java.util.Date;

public class MemberUpdate extends Update {
	Family family;
	User user;
	boolean add;
	
	public MemberUpdate(Family f, User u, boolean a, Date t) {
		family = f;
		user = u;
		add = a;
		time = t;
	}
	
	@Override
	public String toString() {
		return "MEMBER_UPDATE "+family.toString()+" "+user.toString()+" "+add+" "+time.getTime();
	}
}
