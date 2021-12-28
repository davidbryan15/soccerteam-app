package com.soccer.soccerteamapp.service;

import com.soccer.soccerteamapp.entity.Team;
import com.soccer.soccerteamapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }
}
