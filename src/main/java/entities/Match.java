package entities;


import java.sql.Date;
import java.util.Objects;

public class Match {
    private Team firstTeam;
    private Team secondTeam;
    private int teamFirstScore;
    private int teamSecondScore;
    private Date date;

    public Match(Team first, Team second, int teamFirstScore, int teamSecondScore, Date date) {
        this.firstTeam = first;
        this.secondTeam = second;
        this.teamFirstScore = teamFirstScore;
        this.teamSecondScore = teamSecondScore;
        this.date = date;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return teamFirstScore == match.teamFirstScore && teamSecondScore == match.teamSecondScore && Objects.equals(firstTeam, match.firstTeam) && Objects.equals(secondTeam, match.secondTeam) && Objects.equals(date, match.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstTeam, secondTeam, teamFirstScore, teamSecondScore, date);
    }

    @Override
    public String toString() {
        return "Match{" +
                "firstTeam=" + firstTeam +
                ", secondTeam=" + secondTeam +
                ", teamFirstScore=" + teamFirstScore +
                ", teamSecondScore=" + teamSecondScore +
                ", date=" + date +
                '}';
    }
}
