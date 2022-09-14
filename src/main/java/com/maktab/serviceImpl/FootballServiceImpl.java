package com.maktab.serviceImpl;
import com.maktab.model.entities.Team;
import com.maktab.repository.FootballRepository;
import com.maktab.service.FootballService;

import java.sql.SQLException;
import java.util.Scanner;

public class FootballServiceImpl implements FootballService {
    static Scanner scanner = new Scanner(System.in);
    FootballRepository footballRepository = new FootballRepository();

    public void addMenu() throws SQLException {
        Team team = new Team();
        System.out.println("please press1 for add team");
        System.out.println("please press2 for delete team");
        System.out.println("please press3 for information a team");
        System.out.println("please press4 view match table");
        int count = scanner.nextInt();
        switch (count) {
            case 1:
                add(team);
            case 2:
                System.out.println("enter id for delete team");
                int id = scanner.nextInt();
                deleteById(id);

            case 3:
                System.out.println("enter name for view information your team");
                String nameTeam = scanner.next();
                Team informationTeam = showInformation(nameTeam);
                System.out.println(informationTeam);
        }
    }

    @Override
    public void add(Team team) throws SQLException {
        System.out.println("please enter your name team");
        String name = scanner.next();
        System.out.println("please enter winCount");
        int winCount = scanner.nextInt();
        System.out.println("please enter lostCount");
        int lostCount = scanner.nextInt();
        System.out.println("please enter equalCount");
        int equalCount = scanner.nextInt();
        System.out.println("please enter score");
        int score = scanner.nextInt();
        System.out.println("please enter goalsCount");
        int goalsCount = scanner.nextInt();
        System.out.println("please enter matchesPlayed");
        int matchesPlayed = scanner.nextInt();
        team = new Team(name, winCount, lostCount, equalCount, score, goalsCount, matchesPlayed);
        footballRepository.add(team);

    }

    @Override
    public void deleteById(int id) throws SQLException {
        footballRepository.deleteById(id);

    }

    @Override
    public Team showInformation(String name) throws SQLException {
       return footballRepository.showInformation(name);
    }

    }


