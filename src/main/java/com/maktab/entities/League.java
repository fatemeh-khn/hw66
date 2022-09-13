package com.maktab.entities;

import java.sql.SQLException;
import java.util.List;

public interface League {
     void addTeam(Team team) throws SQLException;
    void deleteTeam(int id) throws SQLException;
    void addPlayed();
    Team showInformation(String name);
     List<Match> showLeagueTable();
}
