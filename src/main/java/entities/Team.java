package entities;

import java.util.Objects;

public class Team {
    private String name;
    private int winCount;
    private int lostCount;
    private int equalCount;
    private int score;
    private int goalsCount;
    private int matchesPlayed;

    public Team() {
    }

    public Team(String name, int winCount, int lostCount, int equalCount, int score, int goalsCount, int matchesPlayed) {
        this.name = name;
        this.winCount = winCount;
        this.lostCount = lostCount;
        this.equalCount = equalCount;
        this.score = score;
        this.goalsCount = goalsCount;
        this.matchesPlayed = matchesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLostCount() {
        return lostCount;
    }

    public void setLostCount(int lostCount) {
        this.lostCount = lostCount;
    }

    public int getEqualCount() {
        return equalCount;
    }

    public void setEqualCount(int equalCount) {
        this.equalCount = equalCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGoalsCount() {
        return goalsCount;
    }

    public void setGoalsCount(int goalsCount) {
        this.goalsCount = goalsCount;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return winCount == team.winCount && lostCount == team.lostCount && equalCount == team.equalCount && score == team.score && goalsCount == team.goalsCount && matchesPlayed == team.matchesPlayed && Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, winCount, lostCount, equalCount, score, goalsCount, matchesPlayed);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", lostCount=" + lostCount +
                ", equalCount=" + equalCount +
                ", score=" + score +
                ", goalsCount=" + goalsCount +
                ", matchesPlayed=" + matchesPlayed +
                '}';
    }
}
