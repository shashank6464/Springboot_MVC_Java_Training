package org.example;

import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private List<Player> players = Arrays.asList(
            new Player(1,"Mohit","Indian",35),
            new Player(2,"Mohan","Indian",30),
            new Player(3,"Raj","UK",27),
            new Player(4,"Ravi","USA",19)
            );

    public Player getPlayerByName(String name){
        return players.stream().filter(p ->p.getName().equals(name)).findFirst().get();
    }

    public Player getPlayerById(int id){
        return players.stream().filter(p ->p.getId()==id).findFirst().get();
    }

}
