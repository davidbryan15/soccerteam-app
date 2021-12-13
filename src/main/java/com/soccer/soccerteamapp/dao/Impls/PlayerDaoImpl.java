package com.soccer.soccerteamapp.dao.Impls;

import com.soccer.soccerteamapp.dao.interfaces.PlayerDao;
import com.soccer.soccerteamapp.entity.Player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    @Override
    public void addPlayer(String firstName, String lastName, String email, String position){


//        Player tempPlayer = new Player(firstName, lastName, email, position);


    }

}
