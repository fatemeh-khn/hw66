package com.maktab.serviceImpl;

import com.maktab.model.entities.Team;
import com.maktab.repository.FootballRepository;
import com.maktab.service.FootballService;

import java.sql.SQLException;

public class FootballServiceImpl implements FootballService {

      FootballRepository footballRepository=new FootballRepository();

    @Override
    public void add(Team team) throws SQLException {
       footballRepository.add(team);
    }

    @Override
    public void deleteById(int id) throws SQLException {
footballRepository.deleteById(id);
    }

    @Override
    public Team showInformation(String name) throws SQLException {
        footballRepository.showInformation(name);
        return new Team();
    }
}
