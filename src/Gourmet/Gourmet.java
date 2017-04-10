package Gourmet;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Gourmet {

    private String title;   // 멤버변수는 힙에서 생성됨
    private String mainMenu;
    private int score;

    public Gourmet () {
        System.out.println("그냥 생성자");
    }

    public Gourmet (String title, String mainMenu, int score) { // 모든 지역변수는 스택에 저장
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
        System.out.println("값");
    }
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getMainMenu() { return mainMenu; }

    public void setMainMenu(String mainMenu) { this.mainMenu = mainMenu;}

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }


//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String t) {
//        title = t;
//    }
//
//    public String getMainMenu() {
//        return mainMenu;
//    }
//    public void setMainMenu(String m) {
//        mainMenu = m;
//    }
//
//    public int getScore() {
//        return score;
//    }
//    public void setScore(int s) {
//        score = s;
//    }
}
