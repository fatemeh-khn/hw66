package repository;

import conection.MyConnection;
import entities.Match;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MatchRepository  {
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
}
