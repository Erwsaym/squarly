package me.nbeaussart.game.entity;

import me.nbeaussart.engine.model.Color;
import me.nbeaussart.engine.model.interfaces.IState;
import me.nbeaussart.game.map.GameSquare;

/**
 * Created by beaussan on 31/10/16.
 */
public class Player extends Entity{

    public Player(String name, int life, int atk, GameSquare gameSquare) {
        super(name, life, atk, new Color(0,0,255), gameSquare);
    }

    @Override
    public boolean canPassOn(GameSquare gameSquare) {
        return gameSquare.getState() != IState.WALL && gameSquare.getEntity() == null;
    }
}
