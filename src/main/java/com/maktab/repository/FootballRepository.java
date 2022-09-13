package com.maktab.repository;

import com.maktab.configuration.MyConnection;
import com.maktab.entities.Match;
import com.maktab.entities.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FootballRepository {


    public void add(Team team) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "INSERT INTO team (name,winCount,lostCount,equalCount,score,goalsCount,matchesPlayed) values(?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, team.getName());
        preparedStatement.setInt(2, team.getWinCount());
        preparedStatement.setInt(3, team.getLostCount());
        preparedStatement.setInt(4, team.getEqualCount());
        preparedStatement.setInt(5, team.getScore());
        preparedStatement.setInt(6, team.getGoalsCount());
        preparedStatement.setInt(7, team.getMatchesPlayed());
        preparedStatement.executeUpdate();//todo
    }


    public void deleteById(int id) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT * FROM team where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();//todo
    }
    public Team showInformation(String name) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql="Select * team where name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        Team team = new Team();
        while (resultSet.next()){
            int winCount = resultSet.getInt("winCount");
            int lostCount = resultSet.getInt("lostCount");
            int equalCount = resultSet.getInt("equalCount");
            int score = resultSet.getInt("score");
            int goalsCount = resultSet.getInt("goalsCount");
            int matchesPlayed = resultSet.getInt("matchesPlayed");
            team.setWinCount(winCount);
            team.setLostCount(lostCount);
            team.setEqualCount(equalCount);
            team.setScore(score);
            team.setGoalsCount(goalsCount);
            team.setMatchesPlayed(matchesPlayed);
        }
        return team;
    }
    public void addPlayed(Match match) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "INSERT INTO match (firstTeam,secondTeam,teamFirstScore,teamSecondScore,date) values(?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, match.getFirstTeam().toString());
        preparedStatement.setString(2, match.getSecondTeam().toString());
        preparedStatement.setInt(3, match.getTeamFirstScore());
        preparedStatement.setInt(4, match.getTeamSecondScore());
        preparedStatement.setDate(5,  match.getDate());

        preparedStatement.executeUpdate();//todo
    }

//    public List<Match> showLeagueTable() {
//        return null;
//    }
}
