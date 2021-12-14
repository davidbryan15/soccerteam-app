package com.soccer.soccerteamapp.Entity;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int playerId;

    @Column(name="PLYR_FNAME")
    private String playerFirstName;

    @Column(name="PLYR_LNAME")
    private String playerLastName;

    @Column(name="PLYR_EMAIL")
    private String playerEmail;

    @Column(name="PLYR_ADDRESS")
    private String playerAddress;

    @Column(name="PLYR_CITY")
    private String playerCity;

    @Column(name="PLYR_ST")
    private String playerState;

    @Column(name="PLYR_ZIP")
    private int playerZip;

    @Column(name="PLYR_PHONE")
    private int playerPhone;

    @Column(name="PLYR_POSITION")
    private String playerPosition;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
                         CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Player() {

    }

    public Player(String playerFirstName, String playerLastName, String playerEmail, String playerAddress, String playerCity, String playerState, int playerZip, int playerPhone, String playerPosition) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerEmail = playerEmail;
        this.playerAddress = playerAddress;
        this.playerCity = playerCity;
        this.playerState = playerState;
        this.playerZip = playerZip;
        this.playerPhone = playerPhone;
        this.playerPosition = playerPosition;
    }


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    public String getPlayerAddress() {
        return playerAddress;
    }

    public void setPlayerAddress(String playerAddress) {
        this.playerAddress = playerAddress;
    }

    public String getPlayerCity() {
        return playerCity;
    }

    public void setPlayerCity(String playerCity) {
        this.playerCity = playerCity;
    }

    public String getPlayerState() {
        return playerState;
    }

    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    public int getPlayerZip() {
        return playerZip;
    }

    public void setPlayerZip(int playerZip) {
        this.playerZip = playerZip;
    }

    public int getPlayerPhone() {
        return playerPhone;
    }

    public void setPlayerPhone(int playerPhone) {
        this.playerPhone = playerPhone;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerFirstName='" + playerFirstName + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", playerEmail='" + playerEmail + '\'' +
                ", playerAddress='" + playerAddress + '\'' +
                ", playerCity='" + playerCity + '\'' +
                ", playerState='" + playerState + '\'' +
                ", playerZip=" + playerZip +
                ", playerPhone=" + playerPhone +
                ", playerPosition='" + playerPosition + '\'' +
                ", team=" + team +
                '}';
    }

}
