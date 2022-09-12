package entities;

import java.util.Date;

public class Match {
    private Team first;
    private Team second;
    private int teamFirstScore;
    private int teamSecondScore;
    private Date date;

    public Match(Team first, Team second, int teamFirstScore, int teamSecondScore, Date date) {
        this.first = first;
        this.second = second;
        this.teamFirstScore = teamFirstScore;
        this.teamSecondScore = teamSecondScore;
        this.date = date;
    }

    public Team getFirst() {
        return first;
    }

    public void setFirst(Team first) {
        this.first = first;
    }

    public Team getSecond() {
        return second;
    }

    public void setSecond(Team second) {
        this.second = second;
    }

    public int getTeamFirstScore() {
        return teamFirstScore;
    }

    public void setTeamFirstScore(int teamFirstScore) {
        this.teamFirstScore = teamFirstScore;
    }

    public int getTeamSecondScore() {
        return teamSecondScore;
    }

    public void setTeamSecondScore(int teamSecondScore) {
        this.teamSecondScore = teamSecondScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
