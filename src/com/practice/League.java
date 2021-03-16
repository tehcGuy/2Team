package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {
    private String seasonYear; // 2020/2021
    private String leagueName; // Championship
    private ArrayList<Team<T>> teams; // saves teams

    public League(String seasonYear, String leagueName) {
        this.seasonYear = seasonYear;
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    public void addTeams(Team<T> team) {
        if(this.teams.add(team))
            System.out.println("Added " + team.getTeamName() + " to teams in the league");
        else
            System.out.println("Could not add " + team.getTeamName() + " to teams in the league");
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public ArrayList<Team<T>> getTeams() {
        return teams;
    }
    @Override
    public String toString() {
        return "League{" + "seasonYear='" + seasonYear + '\'' + ", leagueName='" + leagueName + '\'' + ", teams=" + teams + '}';
    }
}
