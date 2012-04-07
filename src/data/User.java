package data;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class User {
	List<Update> updates = new LinkedList<Update>();
	HashSet<Family> families = new HashSet<Family>();
	Integer id;
	
	public User(Integer id) {
		this.id = id;
	}
	
	public ArrayList<Update> getFutureUpdates(Time t) {
		ArrayList<Update> output = new ArrayList<Update>();
		for (Update u: updates) {
			if (u.time.after(t)) {
				output.add(u);
			} else {
				break;
			}
		}
		return output;
	}
	
	public void addUpdate(Update u) {
		for (int i=0;i<updates.size();i++) {
			if (updates.get(i).time.before(u.time)) {
				updates.add(i,u);
				break;
			}
		}
	}
	
	public void receiveUpdate(RatingUpdate u) {
		for (Family f: families) {
			for (User user: f.users) {
				if (!user.equals(this)) {
					user.addUpdate(u);
				}
			}
		}
	}
	
	/**
	 * This has been added or removed from a family
	 * @param u
	 */
	public void receiveUpdate(MemberUpdate u) {
		if (u.add) {
			families.add(u.family);
			u.family.users.add(this);
		} else {
			families.remove(u.family);
			u.family.users.remove(this);
		}
		for (User user: u.family.users) {
			user.addUpdate(u);
		}
	}
}