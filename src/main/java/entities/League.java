package entities;

import java.util.List;

public interface League {
     void addTeam(Team team);
    void deleteTeam(int id);
    void addPlayed();
    Team showInformation(String name);
     List<Match> showLeagueTable();
}
