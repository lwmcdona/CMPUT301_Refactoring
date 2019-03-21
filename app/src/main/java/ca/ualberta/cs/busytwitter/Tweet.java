package ca.ualberta.cs.busytwitter;

import java.io.IOException;
import java.util.Date;

public abstract class Tweet extends ReaderWriter {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

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

    @Override
    protected void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    @Override
    protected void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValidBody();

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
