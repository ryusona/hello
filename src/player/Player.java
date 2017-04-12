package player;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Player {
    private String yearID;
    private String teamID;
    private String lgID;
    private String playerID;
    private long salary;

    public Player(){

    }

    public Player(String yearID, String teamID, String lgID
            , String playerID, long salary) {
        this.setYearID(yearID);
        this.setTeamID(teamID);
        this.setLgID(lgID);
        this.setPlayerID(playerID);
        this.setSalary(salary);
    }


    public String getYearID() {
        return yearID;
    }

    public void setYearID(String yearID) {
        this.yearID = yearID;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "yearID='" + yearID + '\'' +
                ", teamID='" + teamID + '\'' +
                ", lgID='" + lgID + '\'' +
                ", playerID='" + playerID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
