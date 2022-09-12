package entities;

public interface League {
     void addTeam(Team team);
    void deleteTeam(int id);
    void addPlayed();
    Team showInformation();
     String showLeagueTable();
}
