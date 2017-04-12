package halloffame;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class CategoryAverage {

    private String category;
    private String playerID;
    private int average;
    private boolean inducted;

    public CategoryAverage(){
    }

    public CategoryAverage(String category, String playerID, int average, boolean inducted) {
        this.category = category;
        this.playerID = playerID;
        this.average = average;
        this.inducted =inducted;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public  boolean getInducted() {
        return  inducted;
    }

    public void setInducted(boolean inducted) {
        this.inducted = inducted;
    }

    @Override
    public String toString() {
        return "CategoryAverage{" +
                "category='" + category + '\'' +
                ", playerID='" + playerID + '\'' +
                ", inducted='" + inducted + '\'' +
                ", average=" + average +
                '}';
    }
}
