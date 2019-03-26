package ca.ualberta.cs.lab9;

import java.util.Date;

public class Tweet {

    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public Tweet (String text, Date date){
        this.tweetBody = text;
        this.tweetDate = date;
    }

    public Tweet() {
    }

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public String getTweetBody() {
        return tweetBody;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

}
