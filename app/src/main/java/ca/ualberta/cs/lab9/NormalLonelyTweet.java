package ca.ualberta.cs.lab9;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends Tweet implements Serializable {

	private static final long serialVersionUID = 1L;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

	public Date getTweetDate() {
		return super.getTweetDate();
	}

	public void setTweetDate(Date tweetDate) {
		super.setTweetDate(tweetDate);
	}

	public String getTweetBody() {
		return super.getTweetBody();
	}

	public void setTweetBody(String tweetBody) {
		super.setTweetBody(tweetBody);
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}
}