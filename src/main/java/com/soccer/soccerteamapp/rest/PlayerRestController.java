package com.soccer.soccerteamapp.rest;

import com.soccer.soccerteamapp.entity.Player;
import com.soccer.soccerteamapp.entity.Team;
import com.soccer.soccerteamapp.service.PlayerService;
import com.soccer.soccerteamapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerRestController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    @GetMapping("/players")
    public List<Player> getPlayers(){
        return playerService.findAllPlayers();
    }

    @GetMapping("/teams")
    public List<Team> getTeams(){
        return teamService.findAllTeams();
    }


}
