package com.maktab.model.entities;

import com.maktab.model.entities.Team;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Team>  {

        @Override
        public int compare(Team t, Team t1) {

            if(t.getScore() > t1.getScore())
                return -1;
            else{
            if (t.getScore() < t1.getScore())
                return 1;
            else
                return 0;
            }

        }
    }

