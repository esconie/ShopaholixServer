package data;

import java.util.Date;

public class MemberUpdate extends Update {
	User adder;
	User user;
	boolean add;
	
	public MemberUpdate(User ad, User u, boolean a, Date t) {
		adder = ad;
		user = u;
		add = a;
		time = t;
	}
	
	@Override
	public String toString() {
		return "MEMBER_UPDATE "+adder.toString()+" "+user.toString()+" "+add+" "+time.getTime();
	}
}
