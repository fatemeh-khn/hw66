package repository;

import entities.League;
import entities.Match;
import entities.Team;

import java.util.List;

public class TeamRepository implements League {


    @Override
    public void addTeam(Team team) {

    }

    @Override
    public void deleteTeam(int id) {

    }

    @Override
    public void addPlayed() {

    }

    @Override
    public Team showInformation(String name) {
        return null;
    }

    @Override
    public List<Match> showLeagueTable() {
        return null;
    }
}
