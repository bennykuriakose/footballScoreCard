package Model;

public class Match {
    String home;
    String opponent;
    int homeScore;
    int opponentScore;

    public Match(String home, String opponent, int homeScore, int opponentScore) {
        this.home = home;
        this.opponent = opponent;
        this.homeScore = homeScore;
        this.opponentScore = opponentScore;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }
}
