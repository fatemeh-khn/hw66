package com.maktab.serviceImpl;

import com.maktab.model.entities.Match;
import com.maktab.model.entities.Team;
import com.maktab.repository.TeamRepository;
import com.maktab.repository.MatchRepository;
import com.maktab.service.MatchService;

import java.sql.SQLException;
import java.util.Scanner;

public class MatchServiceImpl implements MatchService {
    TeamRepository teamRepo = new TeamRepository();
    MatchRepository matchRepo = new MatchRepository();
    static Scanner scanner = new Scanner(System.in);
@Override
    public void calculateScore(String firstTeam, String secondTeam, int goalTeamFirst, int goalTeamSecond) throws SQLException {
        Match match = new Match();
        Team team1 = teamRepo.showInformation(firstTeam);
        Team team2 = teamRepo.showInformation(secondTeam);

        match.setFirstTeam(firstTeam);
        match.setSecondTeam(secondTeam);
        if (goalTeamFirst > goalTeamSecond) {
            match.setTeamFirstScore(3);
            team1.setScore(team1.getScore() + 3);
            team1.setWinCount(team1.getWinCount() + 1);
            team1.setMatchesPlayed(team1.getMatchesPlayed() + 1);
            team2.setMatchesPlayed(team2.getMatchesPlayed() + 1);
            team2.setLostCount(team2.getLostCount() + 1);
        } else if (goalTeamFirst < goalTeamSecond) {
            match.setTeamSecondScore(3);
            team2.setScore(team2.getScore() + 3);
            team2.setWinCount(team2.getWinCount() + 1);
            team2.setMatchesPlayed(team2.getMatchesPlayed() + 1);
            team1.setMatchesPlayed(team1.getMatchesPlayed() + 1);
            team1.setLostCount(team1.getLostCount() + 1);
        } else {
            team1.setMatchesPlayed(team1.getMatchesPlayed() + 1);
            team2.setMatchesPlayed(team2.getMatchesPlayed() + 1);
            team1.setEqualCount(team1.getEqualCount() + 1);
            team2.setEqualCount(team2.getEqualCount() + 1);
        }

        teamRepo.update(team1.getName());
        teamRepo.update(team2.getName());
        matchRepo.update(match.getFirstTeam());


    }

}