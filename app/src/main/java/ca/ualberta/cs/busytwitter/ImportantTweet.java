package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    int name;

    @Override
    public boolean isValid() {
        if (getTweetBody().trim().length() == 0
                || getTweetBody().trim().length() > 10) {
            return false;
        }

        return true;
    }
}
