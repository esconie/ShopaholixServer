package data;

import java.util.HashMap;

import data.ItemRatings.Rating;


@SuppressWarnings("serial")
public class ItemRatings extends HashMap<User,Rating> {
	public enum Rating {
		UNRATED, BAD, NEUTRAL, GOOD
	}
	public Rating get(User user){
		if(containsKey(user)){
			return super.get(user);
		}
		else{
			return Rating.UNRATED;
		}
	}
}
