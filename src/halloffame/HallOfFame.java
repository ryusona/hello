package halloffame;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFame {
    private String playerID;
    private String yearid;
    private String votedBy;
    private int ballots;
    private int needed;
    private int votes;
    private boolean inducted;
    private String category;

    public HallOfFame(String playerID, String yearid, String votedBy
            , int ballots, int needed, int votes , boolean inducted , String category) {
        this.playerID = playerID;
        this.yearid = yearid;
        this.votedBy = votedBy;
        this.ballots = ballots;
        this.needed = needed;
        this.votes = votes;
        this.inducted = inducted;
        this.category = category;

    }

    public HallOfFame() {

    }


    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getYearid() {
        return yearid;
    }

    public void setYearid(String yearid) {
        this.yearid = yearid;
    }

    public String getVotedBy() {
        return votedBy;
    }

    public void setVotedBy(String votedBy) {
        this.votedBy = votedBy;
    }

    public int getBallots() {
        return ballots;
    }

    public void setBallots(int ballots) {
        this.ballots = ballots;
    }

    public int getNeeded() {
        return needed;
    }

    public void setNeeded(int needed) {
        this.needed = needed;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isInducted() {
        return inducted;
    }

    public void setInducted(boolean inducted) {
        this.inducted = inducted;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "HallOfFame{" +
                "playerID='" + playerID + '\'' +
                ", yearid='" + yearid + '\'' +
                ", votedBy='" + votedBy + '\'' +
                ", ballots=" + ballots +
                ", needed=" + needed +
                ", votes=" + votes +
                ", inducted=" + inducted +
                ", category='" + category + '\'' +
                '}';
    }
}
