package com.maktab.repository;

import com.maktab.configuration.MyConnection;
import com.maktab.model.entities.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamRepository {

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
        preparedStatement.executeUpdate();
    }

    public void deleteById(int id) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "DELETE  FROM team where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeQuery();
    }
        public Team showInformation(String name) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "Select *  from team where name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            return new Team(resultSet.getString("name"),
                    resultSet.getInt("winCount"),
                    resultSet.getInt("lostCount"),
                    resultSet.getInt("equalCount"),
                    resultSet.getInt("score"),
                    resultSet.getInt("goalsCount"),
                    resultSet.getInt("matchesPlayed"));
        }
        return null;
    }

    public void update(String name) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String sql = "UPDATE team  WHERE name = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
    }

}
