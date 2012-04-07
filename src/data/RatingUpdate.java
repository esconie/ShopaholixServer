package data;

import java.sql.Time;

import data.ItemRatings.Rating;

public class RatingUpdate extends Update {
	Item item;
	Rating rating;
	User user;
	
	public RatingUpdate(Item i, Rating r, Time t, User u) {
		item = i;
		rating = r;
		time = t;
		user = u;
	}
	
	@Override
	public String toString() {
		return "RATING_UPDATE "+item.toString()+" "+user.toString()+" "+rating.toString();
	}
}
