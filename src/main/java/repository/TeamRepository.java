package repository;

import conection.MyConnection;
import entities.League;
import entities.Match;
import entities.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeamRepository  {


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

//    public List<Match> showLeagueTable() {
//        return null;
//    }
}
