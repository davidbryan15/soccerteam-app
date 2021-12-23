package com.soccer.soccerteamapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int teamId;

    @Column(name = "TEAM_NAME")
    private String teamName;

//The following code is causing infinite recusion b/w team and player when testing through Rest API. Causing app to rewrite the Json Object over and over
//    @OneToMany(mappedBy = "team",
//               cascade = {CascadeType.DETACH, CascadeType.MERGE,
//                          CascadeType.PERSIST, CascadeType.REFRESH})
//    private List<Player> players;

    @ManyToMany
    @JoinTable(
            name = "TEAM_MGR_ASSGN",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "mgr_id")
    )
    private List<Manager> managers;

    public Team() {

    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

//causing infinite recusion when testing through Rest API. Causing app to rewrite the Json Object over and over
//
//    public List<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(List<Player> players) {
//        this.players = players;
//    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                '}';
    }

}
