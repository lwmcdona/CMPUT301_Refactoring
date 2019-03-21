package ca.ualberta.cs.busytwitter;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends Tweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValidBody() {
		int length = getTweetBody().trim().length();
		if (length == 0
				|| length > 10) {
			return false;
		}

		return true;
	}

}