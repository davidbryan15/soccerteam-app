package com.soccer.soccerteamapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int playerId;

    @Column(name = "PLYR_FNAME")
    private String playerFirstName;

    @Column(name = "PLYR_LNAME")
    private String playerLastName;

    @Column(name = "PLYR_EMAIL")
    private String playerEmail;

    @Column(name = "PLYR_ADDRESS")
    private String playerAddress;

    @Column(name = "PLYR_CITY")
    private String playerCity;

    @Column(name = "PLYR_ST")
    private String playerState;

    @Column(name = "PLYR_ZIP")
    private int playerZip;

    @Column(name = "PLYR_PHONE")
    private int playerPhone;

    @Column(name = "PLYR_POSITION")
    private String playerPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;

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
