package com.maktab.service;

import com.maktab.model.entities.Team;

import java.sql.SQLException;

public interface TeamService {
     void add(Team team) throws SQLException;
    void deleteById(int id) throws SQLException;
    Team showInformation(String name) throws SQLException;
}
