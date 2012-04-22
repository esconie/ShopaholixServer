package data;

import java.util.Date;

import data.Rating;

public class RatingUpdate extends Update {
	String item;
	Rating rating;
	User user;
	
	public RatingUpdate(String i, Rating r, Date t, User u) {
		item = i;
		rating = r;
		time = t;
		user = u;
	}
	
	@Override
	public String toString() {
		return "RATING_UPDATE "+item+" "+user.toString()+" "+rating.toString()+" "+time.getTime();
	}
	
	
	public RatingUpdate changeTime(Date time) {
		return new RatingUpdate(item, rating, time, user);
	}
}
