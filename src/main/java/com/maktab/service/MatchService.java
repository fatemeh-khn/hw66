package com.maktab.service;

import java.sql.SQLException;

public interface MatchService {
    void calculateScore(String firstTeam, String secondTeam, int goalTeamFirst, int goalTeamSecond) throws SQLException;
}